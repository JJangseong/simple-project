package com.simple.services.member;

import com.simple.models.member.CreateMemberDto;
import com.simple.models.member.Member;
import com.simple.models.member.UpdateMemberDto;
import org.springframework.stereotype.Service;

/**
 * Created by marathoner on 2021/09/20
 */
public interface MemberService {

    // 아이디로 조회
    public Member findByEmail(String email);
    // 생성
    public void create(CreateMemberDto createMemberDto);
    // 수정
    public void update(UpdateMemberDto updateMemberDto);
}
