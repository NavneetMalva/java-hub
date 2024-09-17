package com.springboot.databasedemo;

import com.springboot.databasedemo.entity.Person;
import com.springboot.databasedemo.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

    @Autowired
    PersonJpaRepository repository;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("User id 10001 -> {}", repository.findById(10001));
        logger.info("Inserting -> {}", repository.insert(new Person("Tara", "Berlin", new Date())));
        logger.info("Inserting -> {}", repository.insert(new Person("Summer", "Tokyo", new Date())));
        logger.info("Update 10003 -> {}", repository.update(new Person(10003, "Pieter", "Utrecht", new Date())));
        repository.deleteById(10002);
    }

}
