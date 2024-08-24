package com.example.apirest.config;

import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;  

@Configuration  
public class OpenApiConfig {  

    @Bean  
    public OpenAPI customOpenAPI() {  
        return new OpenAPI()  
            .info(new Info()  
                .title("Minha API")  
                .version("1.0")  
                .description("Documentação da Minha API")  
                .contact(new Contact()  
                    .name("Seu Nome")  
                    .url("http://seusite.com")  
                    .email("seuemail@exemplo.com")))  
            .externalDocs(new ExternalDocumentation()  
                .description("Documentação Externa")  
                .url("http://seusite.com/docs"));  
    }   
}