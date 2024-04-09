package com.kendev.controller;

import com.kendev.entity.Category;
import com.kendev.service.CategoryServices;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.inject.Inject;

@Controller("/Categories")
@Tag(name = "Categories")
public class CategoryController {
    @Inject
    CategoryServices cs;

    @Get(uri="/")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<Category> getCategories() {return cs.getAllCategories();}

    @Get(uri="/{uuid}")
    @Produces(MediaType.APPLICATION_JSON)
    public Category getCategory(@PathVariable String uuid) {return cs.getById(uuid);}

    @Post(uri="/")
    @Produces(MediaType.APPLICATION_JSON)
    public Category createCategory(@Body Category category) {return cs.saveOrUpdate(category);}

    @Put(uri="/update/{uuid}")
    @Produces(MediaType.APPLICATION_JSON)
    public Category updateCategory(@PathVariable String uuid, @Body Category category) {return cs.saveOrUpdate(category);}

    @Delete(uri="/{uuid}")
    public void deleteCategory(@PathVariable String uuid) {cs.delete(uuid);}
}
