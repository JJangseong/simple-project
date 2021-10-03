package com.simple.common.repositories;

import com.simple.common.models.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by marathoner on 2021/07/16.
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
    public Member findByEmail(String email);
}
