# 4. API Gateway

This Spring Boot application acts as a gateway for multiple services, and also discoverable by Eureka server.

## Features
- **Service Registration**: Registers itself with Eureka server, making it discoverable to clients.
- **Gateway**: Acts as a gateway for the registered services, routing requests to the appropriate service based on the request path.
- **Load Balancing**: Utilizes Eureka's load balancing capabilities to distribute traffic evenly between instances of the services.

## Configuration

| Key                                  | Type    | Description                                                                                                                                                                                                        |
|--------------------------------------|---------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| spring.application.name              | String  | The name of the application. In this case : `ApiGateWay`                                                                                                                                                           | 
| spring.main.web-application-type     | String  | To configure the type of web application that the embedded web server should run. <br/> Possible Values : `none`, `servlet` and `reactive`. <br/> Use `reactive` when spring-boot-starter-web dependency is there. |
| eureka.instance.hostname	            | String  | Sets the hostname for a Eureka instance. For example, to set the hostname to `localhost` in standalone mode                                                                                                        |
| eureka.client.serviceUrl.defaultZone | String  | To specify the default zone for the Eureka server. <br/>This property is used by Eureka clients to locate the Eureka server where they register themselves and discover other services                             |

### Gateway Routing Configuration

| Key                                          | Type   | Description                                                                                                                                                                                                 | Example                                                |
|----------------------------------------------|--------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------|
| spring.cloud.gateway.routes[i].id            | String | To specify a unique identifier for a route.                                                                                                                                                                 | `serviceOne`                                           |
| spring.cloud.gateway.routes[i].uri           | String | To specify the URI to which the request should be forwarded for the route. <br/> URI can be a physical URL (http:// or https://) or a logical name that will be resolved by a service registry like Eureka. | `http://localhost:9001` or `lb://ServiceOne`           |
| spring.cloud.gateway.routes[i].predicates[j] | String | Predicates are used to match incoming requests to routes based on various criteria such as the request path, method, headers, etc.                                                                          | `Path=/ServiceOne/**` or `Method=GET`                  |
| spring.cloud.gateway.routes[i].filters[k]    | String | Filters are used to modify the request or response as it passes through the gateway, allowing you to add or remove headers, modify the request path, etc.                                                   | `StripPrefix=1` or `AddRequestHeader=X-Request-Id,123` |

#### Description on some of the examples 
- for the config, uri=`lb://ServiceOne`, **ServiceOne** is the logical name of a service registered with a service registry like Eureka. Spring Cloud Gateway will resolve this name to the actual physical URL of the service
- The Filter `StripPrefix=1` removes the first segment **(ServiceOne)** from the request path. So, a request to `/ServiceOne/hello` would be forwarded to the downstream service as `/hello`.

## How to Run

To run this project locally, you need to have **Java** and **Maven** installed on your machine.

1. Clone the repository
2. Navigate to the project directory
3. Update the client configuration like `server.port` and `eureka.client.serviceUrl.defaultZone`
   in `application.properties` file.
4. Update the Routing configuration like routes _uri_, _predicates_ and _filters_. (Just see that section for **## For Service One and Service Two** is Uncommented)
5. Make sure the [Eureka Server](../EurekaServer/README.md) and other services like [Service One](../EurekaServiceOne/README.md) and [Service Two](../EurekaServiceTwo/README.md) are up and running.
6. Run `mvn spring-boot:run` to start the application.
7. See if the Services are discoverable at the Eureka Server by accessing [http://localhost:9000](http://localhost:9000).
8. Access/Route the application through `http://localhost:9001` like: [http://localhost:9001/ServiceOne/hello](http://localhost:9001/ServiceOne/hello) and [http://localhost:9001/ServiceTwo/hello](http://localhost:9001/ServiceTwo/hello)

## Dependencies

- Spring Boot
- Spring Cloud Gateway
- Spring Cloud Netflix Eureka Client

## Author

- Mayank Sahu (https://github.com/mayank19o7).

