package com.simple.controllers.v1.example;

import com.simple.services.example.ExampleService;
import com.simple.models.example.ExampleDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by marathoner on 2021/07/16.
 */
@RequestMapping("/api/v1/example")
@RequiredArgsConstructor
@RestController
public class ExampleController {

    private final ExampleService exampleService;

    @GetMapping("/{exampleId}")
    public ResponseEntity<ExampleDto> getExampleById(@PathVariable("exampleId") Long exampleId) {
        ExampleDto exampleDto = exampleService.getExampleById(exampleId);
        return new ResponseEntity<>(exampleDto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewExample(@RequestBody @Validated ExampleDto exampleDto) {
        exampleService.saveNewExample(exampleDto);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{exampleId}")
    public ResponseEntity updateExampleById(@PathVariable("exampleId") Long exampleId, @RequestBody @Validated ExampleDto exampleDto) {
        exampleService.updateExampleById(exampleId, exampleDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
