package org.example.servicio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Servicio1Application {

    public static void main(String[] args) {
        SpringApplication.run(Servicio1Application.class, args);
    }

}