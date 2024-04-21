package com.mak.service;

import com.mak.domain.User;
import com.mak.domain.UserDetailsModel;
import com.mak.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService extends CustomUserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User saveUser(User user) {
        UserDetailsModel userDetails = getLoggedInUser();

        User userToSave = userDetails != null ? userDetails.getUser() : new User();
        userToSave.setName(user.getName());
        userToSave.setEmail(user.getEmail());
        userToSave.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepository.save(userToSave);
    }
}
