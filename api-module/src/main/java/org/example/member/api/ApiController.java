package org.example.member.api;

import lombok.RequiredArgsConstructor;
import org.example.member.application.ApiFacade;
import org.example.member.domain.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiController {
    private final ApiFacade apiFacade;

    @PostMapping("/")
    public void saveMember() {
        apiFacade.saveMember();
    }

    @GetMapping("/")
    public Member getMember() {
        return apiFacade.findMember();
    }
}
