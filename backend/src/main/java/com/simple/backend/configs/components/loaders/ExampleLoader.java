package com.simple.backend.configs.components.loaders;

import com.simple.backend.models.example.Example;
import com.simple.backend.repositories.ExampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by marathoner on 2021/07/16.
 */
@RequiredArgsConstructor
@Component
public class ExampleLoader implements CommandLineRunner {

    private final ExampleRepository exampleRepository;

    @Override
    public void run(String... args) throws Exception {
        loadExampleObjects();
    }

    private void loadExampleObjects() {
        if (exampleRepository.count() == 0) {
            exampleRepository.save(Example.builder().content("My First Content").build());
        }
    }
}
