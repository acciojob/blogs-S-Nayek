package com.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogsApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogsApplication.class, args);
    }
}

/*spring.datasource.url=jdbc:mysql://localhost:3306/blogs?createTableIfNotExists=true
        spring.datasource.username=root
        spring.datasource.password=Kan@2911
        spring.jpa.hibernate.ddl-auto=update
        logging.level.org.springframework=debug*/