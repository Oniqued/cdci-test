package com.example.testrds.service;

import com.example.testrds.domain.Member;
import com.example.testrds.repo.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final MemberRepository memberRepository;

    @Override
    public void addMember(Member member) {
        memberRepository.save(member);
    }
}
