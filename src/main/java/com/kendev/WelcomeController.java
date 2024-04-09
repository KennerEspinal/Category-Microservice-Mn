package com.kendev;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.swagger.v3.oas.annotations.tags.Tag;

@Controller("/")
@Tag(name = "Path Principal")
public class WelcomeController {
    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Hello World from my API server";
    }
}
