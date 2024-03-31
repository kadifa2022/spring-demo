package com.cydeo.springdemo;

import com.cydeo.springdemo.engineCarDemo_IOC.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
		Car car = context.getBean(Car.class);
		System.out.println(car.getEngineData());
	}

}
