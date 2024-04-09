package com.kendev.service;

import com.kendev.entity.Category;
import com.kendev.persistence.CategoryRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.UUID;

@Singleton
public class CategoryServices {
    @Inject
    CategoryRepository cr;

    public Iterable<Category> getAllCategories() {return cr.findAll();}

    public Category saveOrUpdate(Category category){
        Category categoryNew = null;
        if(category.getUuid() != null && cr.existsById(category.getUuid())){
            categoryNew = cr.update(category);
        }else{
            categoryNew = cr.save(category);
        }
        return categoryNew;
    }

    public Category getById(String uuid){
        return cr.findById(UUID.fromString(uuid)).orElse(null);
    }

    public void delete(String uuid){
        cr.deleteById(UUID.fromString(uuid));
    }
}
