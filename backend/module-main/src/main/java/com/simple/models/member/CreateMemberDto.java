package com.simple.models.member;

import com.simple.common.models.code.Code;
import com.simple.common.models.member.LoginType;
import lombok.*;

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
public class CreateMemberDto {

    @NotNull
    @Email
    private String email;

    @NotNull
    private LoginType loginType;

    @NotNull
    private Float age;

    @Null
    private String about;

    @NotNull
    private Code city;

}
