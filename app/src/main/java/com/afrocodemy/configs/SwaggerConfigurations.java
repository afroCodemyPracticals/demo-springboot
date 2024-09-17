package com.afrocodemy.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Fasoft
 * @date 31/May/2024
 */
@Configuration
public class SwaggerConfigurations {

    @Bean
    public OpenAPI myOpenAPI() {

        Contact contact = new Contact();
        contact.setEmail("developers@afrocodemy.co.zw");
        contact.setName("Afrocodemy Engineering Team");
        contact.setUrl("https://www.afrocodemy.co.zw/#/");

        License mitLicense = new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");

        Info info = new Info()
                .title("Afrocodemy Demo API")
                .version("1.0")
                .contact(contact)
                .description("Afrocodemy Demo API").termsOfService("https://www.afrocodemy.co.zw/#/")
                .license(mitLicense);

        return new OpenAPI().info(info);

    }
}
