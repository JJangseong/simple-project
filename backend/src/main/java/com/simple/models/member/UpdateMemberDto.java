package com.simple.models.member;

import com.simple.models.code.Code;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * Created by marathoner on 2021/09/20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateMemberDto {

    @NotNull
    @Email
    private String email;

    @Null
    private Float age;

    @Null
    private String about;

    @Null
    private Code city;

}
