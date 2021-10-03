package com.simple.services.member;

import com.simple.mappers.member.CreateMemberMapper;
import com.simple.mappers.member.UpdateMemberMapper;
import com.simple.models.member.CreateMemberDto;
import com.simple.models.member.Member;
import com.simple.models.member.UpdateMemberDto;
import com.simple.repositories.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by marathoner on 2021/09/20
 */
@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final CreateMemberMapper createMemberMapper;
    private final UpdateMemberMapper updateMemberMapper;

    @Override
    public Member findByEmail(String email) {
        return memberRepository.findByEmail(email);
    }

    @Override
    public void create(CreateMemberDto createMemberDto) {
        Member member = createMemberMapper.toEntity(createMemberDto);
        memberRepository.save(member);
    }

    @Override
    public void update(UpdateMemberDto updateMemberDto) {
        Member member = updateMemberMapper.toEntity(updateMemberDto);
        Member findMember = memberRepository.findByEmail(member.getEmail());
        findMember.setAbout(member.getAbout());
        memberRepository.save(findMember);
    }
}
