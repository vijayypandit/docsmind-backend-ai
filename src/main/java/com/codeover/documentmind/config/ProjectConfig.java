package com.codeover.documentmind.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI().info(
            new Info().title("DocumentMind API")
                .description("RESTAPI for document processing and question answering using OpenAI models and Spring AI. This API allows users to upload documents, process them, and ask questions based on the content of the documents.")
                .version("1.0.0")
                .contact(new Contact()
                    .name("CodeOver Technologies")
                    .email("contact@codeover.com")
                    .url("https://www.codeover.com")
                )
        );
    }
}
