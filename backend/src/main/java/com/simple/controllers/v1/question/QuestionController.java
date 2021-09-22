package com.simple.controllers.v1.question;

import com.simple.models.question.CreateQuestionDto;
import com.simple.services.question.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/question")
@RequiredArgsConstructor
@RestController
public class QuestionController {

    private final QuestionService questionService;

    @PostMapping
    public ResponseEntity create(@RequestBody @Validated CreateQuestionDto createQuestionDto) {
        questionService.create(createQuestionDto);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
