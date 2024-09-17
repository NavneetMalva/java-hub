package com.springboot.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.databasedemo.entity.Person;
import com.springboot.databasedemo.jdbc.PersonJdbcDao;


// Uncomment this while running jdbc
//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao personDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", personDao.findAll());
		logger.info("User details -> {}", personDao.findById(10001));
		logger.info("Deleting user -> No. of Rows deleted ->{}", personDao.deleteById(10002));
		logger.info("Inserting 10004 -> {}", personDao.insert(new Person(10004, "Tara", "Berlin", new Date())));
		logger.info("Update 10003 -> {}", personDao.update(new Person(10003, "Pieter", "Utrecht", new Date())));

	}

}
