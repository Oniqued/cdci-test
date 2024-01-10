package com.example.testrds.service;

import com.example.testrds.domain.Member;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    void addMember(Member member);
}
