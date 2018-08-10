# spring-eureka-product

### 添加步骤

1. 增加依赖

   ```groovy
   # build.gradle
   
   ...
   compile('org.springframework.cloud:spring-cloud-starter-netflix-eureka-client')
   ...
   ```

   

2. 配置项

   ```yaml
   # application.yml
   server:
     port: 8082
   spring:
     application:
       name: product-service
   eureka:
     client:
       serviceUrl:
         defaultZone: http://localhost:8761/eureka/
   ```

   

3. 增加注解

   ```java
   // Application.java
   
   @EnableEurekaClient
   ...
   ```

   