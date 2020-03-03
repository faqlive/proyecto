package net.facundojlopez.project.contenedor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ProjectContainerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectContainerApplication.class, args);
	}

}
