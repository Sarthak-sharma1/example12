package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

    @Bean
    Vehicle vehicle1(){
        Vehicle veh = new Vehicle();
        veh.setName("Challenger");
        return veh;
    }
    @Bean
    /*@Primary*/
    Vehicle vehicle2(){
        Vehicle veh = new Vehicle();
        veh.setName("Mercedes");
        return veh;
    }
    @Bean
    Vehicle vehicle3(){
        Vehicle veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }
}
