package com.simple.mappers.question;

import com.simple.configs.components.DateComponent;
import com.simple.mappers.EntityMapper;
import com.simple.models.question.CreateQuestionDto;
import com.simple.models.question.Question;
import org.mapstruct.Mapper;

@Mapper(uses = {DateComponent.class}, componentModel = "spring")
public interface CreateQuestionMapper extends EntityMapper<CreateQuestionDto, Question> {
}
