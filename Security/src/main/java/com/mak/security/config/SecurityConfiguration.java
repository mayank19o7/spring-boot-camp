package com.mak.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Authentication
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();

        //Pheonix has only one role of USER
        userDetailsManager.createUser(
                User.builder().username("Pheonix")
                        .password(passwordEncoder().encode("Pheonix123"))
                        .roles("USER").build());

        //Ninja has two roles, ADMIN and USER
        userDetailsManager.createUser(
                User.builder().username("Ninja")
                        .password(passwordEncoder().encode("Ninja987"))
                        .roles("ADMIN", "USER").build());

        return userDetailsManager;
    }

    /**
     * Authorization :
     * <ul>
     * <li> In Spring Security, CSRF protection is enabled by default for unsafe HTTP methods, such as POST, PUT, DELETE, etc.
     *       So, we need to disable the csrf. </li>
     * <li> The user should be logged in to access particular api. </li>
     * <li> The api which user wants to access , is he allowed/authorize or not ? </li>
     * </ul>
     */
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable).authorizeHttpRequests((authorize) -> {
            authorize.requestMatchers("/login/admin").hasRole("ADMIN"); // ADMIN can access /login/admin (POST,PUT,GET...)
            authorize.requestMatchers(HttpMethod.POST, "/login/user").hasRole("ADMIN"); // To create a new user, only ADMIN can do it.
            authorize.requestMatchers(HttpMethod.GET, "/login/user").hasRole("USER"); // USER can only view/read the /login/user api.
            authorize.anyRequest().authenticated();
        }).httpBasic(Customizer.withDefaults());
        return http.build();
    }

}
