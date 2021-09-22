package com.simple.services.question;

import com.simple.mappers.question.CreateQuestionMapper;
import com.simple.models.question.CreateQuestionDto;
import com.simple.models.question.Question;
import com.simple.repositories.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;
    private final CreateQuestionMapper createQuestionMapper;

    @Override
    public void create(CreateQuestionDto createQuestionDto) {
        Question question = createQuestionMapper.toEntity(createQuestionDto);
        questionRepository.save(question);
    }
}
