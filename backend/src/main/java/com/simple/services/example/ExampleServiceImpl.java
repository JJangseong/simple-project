package com.simple.services.example;

import com.simple.mappers.ExampleMapper;
import com.simple.models.example.Example;
import com.simple.models.example.ExampleDto;
import com.simple.repositories.ExampleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by marathoner on 2021/07/16.
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class ExampleServiceImpl implements ExampleService {

    private final ExampleRepository exampleRepository;
    private final ExampleMapper exampleMapper;

    @Override
    public ExampleDto getExampleById(Long exampleId) {
        Example example = exampleRepository.getById(exampleId);
        return exampleMapper.toDto(example);
    }

    @Override
    public void saveNewExample(ExampleDto exampleDto) {
        Example example = exampleMapper.toEntity(exampleDto);
        exampleRepository.save(example);
    }

    @Override
    public void updateExampleById(Long exampleId, ExampleDto exampleDto) {
        Example example = exampleRepository.getById(exampleId);
        example.setContent(exampleDto.getContent());
        exampleRepository.save(example);
    }
}
