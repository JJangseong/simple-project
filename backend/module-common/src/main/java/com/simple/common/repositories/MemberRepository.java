package com.simple.repositories;

import com.simple.models.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by marathoner on 2021/07/16.
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
    public Member findByEmail(String email);
}
