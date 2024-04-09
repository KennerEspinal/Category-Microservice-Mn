package com.kendev.entity;

import io.micronaut.data.annotation.AutoPopulated;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Data;

import java.util.UUID;

@Serdeable
@Data
@MappedEntity
public class Category {
    @Id
    @AutoPopulated
    private UUID uuid;

    private String name;
}
