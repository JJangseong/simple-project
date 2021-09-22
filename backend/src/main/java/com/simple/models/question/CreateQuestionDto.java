package com.simple.models.question;

import com.simple.models.code.Code;
import com.simple.models.member.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateQuestionDto {

    @NotNull
    private String title;

    @NotNull
    private String content;

    @NotNull
    private Member user;

    @NotNull
    private Code categoryId;
}
