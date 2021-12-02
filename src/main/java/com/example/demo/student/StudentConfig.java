package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student (
                    "Mariam",
                    "mariam.jmail@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)
            );
            Student alex = new Student (
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1990, JANUARY, 5)
            );
            repository.save(mariam);
            repository.save(alex);
        };
    }
}
