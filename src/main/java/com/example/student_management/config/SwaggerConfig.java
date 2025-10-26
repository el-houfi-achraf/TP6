package com.example.student_management.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Gestion des Étudiants")
                        .version("1.0.0")
                        .description("Documentation de l'API REST pour la gestion des étudiants. " +
                                    "Cette API permet de créer, lire, modifier et supprimer des étudiants, " +
                                    "ainsi que d'obtenir des statistiques.")
                        .contact(new Contact()
                                .name("Équipe de Développement")
                                .email("support@studentmanagement.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0.html")));
    }
}

