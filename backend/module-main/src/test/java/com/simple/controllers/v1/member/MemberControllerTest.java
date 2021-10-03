package com.simple.controllers.v1.member;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.simple.common.models.member.LoginType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestConstructor;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Created by marathoner on 2021/09/20
 */
@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
@ActiveProfiles(profiles = {"local"})
@AutoConfigureMockMvc
class MemberControllerTest {

    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getByEmail() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/member/sungjin5891@gmail.com").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void create() throws Exception {
        String json = objectMapper.writeValueAsString(createMemberDto());

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/member/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(MockMvcResultMatchers.status().isCreated());
    }

    @Test
    void update() throws Exception {
        String json = objectMapper.writeValueAsString(updateMemberDto());

        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/member/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(MockMvcResultMatchers.status().isNoContent());
    }

    private CreateMemberDto createMemberDto() {
        return CreateMemberDto.builder()
                .email("sungjin5891@gmail.com")
                .about("소개소개소개")
                .age(20F)
                .loginType(LoginType.APPLE)
                .build();
    }

    private UpdateMemberDto updateMemberDto() {
        return UpdateMemberDto.builder()
                .email("sungjin5891@gmail.com")
                .about("zzzz")
                .build();
    }
}
