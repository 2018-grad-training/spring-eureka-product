package cn.thoughtworks.springeurekaproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringEurekaProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaProductApplication.class, args);
	}
}
