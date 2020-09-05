package com.learn.springboot2jpahibernate.config;

import io.swagger.annotations.Contact;
import io.swagger.annotations.ExternalDocs;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;

@SwaggerDefinition(
        info = @Info(
                description = "This documentation contains informations about the student and their enrolled courses",
                version = "V1.0",
                title = "Enrollment API",
                contact = @Contact(
                   name = "Rafli Putra", 
                   email = "rafli.putra712@gmail.com", 
                   url = "https://www.i-3.co.id"
                ),
                license = @License(
                   name = "Apache 2.0", 
                   url = "http://www.apache.org/licenses/LICENSE-2.0"
                )
        ),
        consumes = {"application/json", "application/xml"},
        produces = {"application/json", "application/xml"},
        schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS},
        externalDocs = @ExternalDocs(value = "Read This For Sure", url = "https://www.i-3.co.id")
)
public interface ApiDocumentationConfig {

}
