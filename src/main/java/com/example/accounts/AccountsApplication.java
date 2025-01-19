package com.example.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
// Below annotation needed if that project does not follow standard packaging structure
/*
 * @ComponentScans({@ComponentScan("package"})
 * @EnableJpaRepositories("package")
 * @EntityScan("package")
 * */
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Accounts microservice API Documentation",
                description = "Just for demo and practise",
                version = "v1",
                contact = @Contact(
                        name = "Manoj Madushanka",
                        email = "madushankamanoj414@gmail.com",
                        url = ""
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = ""
                )
        )
)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
