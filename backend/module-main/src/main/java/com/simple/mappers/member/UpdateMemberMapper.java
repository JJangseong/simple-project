package com.simple.mappers.member;

import com.simple.common.configs.components.DateComponent;
import com.simple.mappers.EntityMapper;
import com.simple.common.models.member.Member;
import com.simple.models.member.UpdateMemberDto;
import org.mapstruct.Mapper;

/**
 * Created by marathoner on 2021/07/16.
 */
@Mapper(uses = {DateComponent.class}, componentModel = "spring")
public interface UpdateMemberMapper extends EntityMapper<UpdateMemberDto, Member> {
}
