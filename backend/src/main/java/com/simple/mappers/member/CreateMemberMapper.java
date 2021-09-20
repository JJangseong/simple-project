package com.simple.mappers.member;

import com.simple.configs.components.DateComponent;
import com.simple.mappers.EntityMapper;
import com.simple.models.member.CreateMemberDto;
import com.simple.models.member.Member;
import org.mapstruct.Mapper;

/**
 * Created by marathoner on 2021/07/16.
 */
@Mapper(uses = {DateComponent.class}, componentModel = "spring")
public interface CreateMemberMapper extends EntityMapper<CreateMemberDto, Member> {
}
