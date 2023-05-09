package co.develhope.swagger2.configurations;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@OpenAPIDefinition
@Configuration
public class SpringDocConfig implements WebMvcConfigurer {

    @Bean
    public OpenAPI api() {

        return new OpenAPI().info(new Info()
                        .title("Math Api")
                        .version("1.0.0")
                        .description("An API that provides services")
                        .contact(new Contact()
                                .name("Lucrezia")
                                .url("https://en.wikipedia.org/wiki/MIT_License\"")
                                .email("lucrezia.rumore@develhope.co")))
                .tags(List.of(new Tag().name("math-controller")
                        .description("Controller dedicated just to API > math operations")))
                .tags(List.of(new Tag().name("default-controller")
                        .description("The main initial controller for all the API features")));
    }

}

