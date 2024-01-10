package com.example.testrds.member;

import com.example.testrds.domain.Member;
import com.example.testrds.repo.MemberRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AuthServiceTest {
    private final MemberRepository memberRepository;

    public AuthServiceTest(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Test
    @DisplayName("회원 추가")
    void addMember() {
        Member member = Member.builder()
                .name("홍길동")
                .build();
        memberRepository.save(member);
    }
}
