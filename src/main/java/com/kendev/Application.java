package com.kendev;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
    info = @Info(
            title = "categorymicroservice",
            version = "0.0",
            description = "A Microservice that returns a list of categories",
            contact = @Contact(
                    name = "Kenner Espinal",
                    url = "https://github.com/KennerEspinal",
                    email = "kennerespinalg@gmail.com"
            ),
            license = @License(
                    name = "Apache 2.0",
                    url = "http://www.apache.org/licenses/LICENSE-2.0.html"
            )
    )
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}