package com.simple.controllers.v1.member;

import com.simple.models.member.CreateMemberDto;
import com.simple.models.member.Member;
import com.simple.models.member.UpdateMemberDto;
import com.simple.services.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by marathoner on 2021/09/20
 */
@RequestMapping("/api/v1/member")
@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/{email}")
    public ResponseEntity<Member> getByEmail(@PathVariable("email") String email) {
        Member member = memberService.findByEmail(email);
        return new ResponseEntity<Member>(member, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody @Validated CreateMemberDto createMemberDto) {
        memberService.create(createMemberDto);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody @Validated UpdateMemberDto updateMemberDto) {
        memberService.update(updateMemberDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
