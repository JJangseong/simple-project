package com.simple.backend.mappers;

import com.simple.backend.models.example.Example;
import com.simple.backend.models.example.ExampleDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by marathoner on 2021/07/16.
 */

@SpringBootTest
class ExampleMapperTest {

    @Autowired
   private ExampleMapper exampleMapper;

    @Test
    void dtoToEntity() {
        ExampleDto dto = ExampleDto
                .builder()
                .content("Hello")
                .build();

        Example example = exampleMapper.toEntity(dto);

        assertEquals(dto.getContent(), example.getContent());
    }
}
