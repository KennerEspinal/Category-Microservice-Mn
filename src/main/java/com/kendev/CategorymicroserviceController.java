package com.kendev;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

@Controller("/categorymicroservice")
@Tag(name= "Ejemplo Controller")
public class CategorymicroserviceController {

    @Get(uri="/")
    @Produces(MediaType.APPLICATION_JSON)
    public String index() {
        return "Hola al desde un Crontrolador Vacio";
    }
}