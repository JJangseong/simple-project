package com.simple.services.question;


import com.simple.models.question.CreateQuestionDto;

public interface QuestionService {
    // 생성
    public void create(CreateQuestionDto createQuestionDto);
}
