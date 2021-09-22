package com.simple.controllers.v1.question;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.simple.models.question.CreateQuestionDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestConstructor;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
@ActiveProfiles(profiles = {"local"})
@AutoConfigureMockMvc
class QuestionControllerTest {

    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void create() throws Exception {
        String json = objectMapper.writeValueAsString(createQuestionDto());

        mockMvc.perform(post("/api/v1/question/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isCreated());
    }

    private CreateQuestionDto createQuestionDto() {
        return CreateQuestionDto.builder()
                .title("문의입니다.")
                .content("나문희 선생님")
                .build();
    }
}
