package com.simple.backend.mappers;

import com.simple.backend.configs.components.DateComponent;
import com.simple.backend.models.example.Example;
import com.simple.backend.models.example.ExampleDto;
import org.mapstruct.Mapper;

/**
 * Created by marathoner on 2021/07/16.
 */
@Mapper(uses = {DateComponent.class}, componentModel = "spring")
public interface ExampleMapper extends EntityMapper<ExampleDto, Example> {
}
