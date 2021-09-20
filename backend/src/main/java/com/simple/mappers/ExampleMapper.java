package com.simple.mappers;

import com.simple.configs.components.DateComponent;
import com.simple.models.example.Example;
import com.simple.models.example.ExampleDto;
import org.mapstruct.Mapper;

/**
 * Created by marathoner on 2021/07/16.
 */
@Mapper(uses = {DateComponent.class}, componentModel = "spring")
public interface ExampleMapper extends EntityMapper<ExampleDto, Example> {
}
