package com.example.testrds.controller;

import com.example.testrds.domain.Member;
import com.example.testrds.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @RequestMapping("/health_check")
    public String healthCheck() {
        return "OK-bb";
    }

    @RequestMapping("/hello")
    public void addMember() {
        Member member = Member.builder()
                .name("홍길동")
                .build();
        authService.addMember(member);
    }
}
