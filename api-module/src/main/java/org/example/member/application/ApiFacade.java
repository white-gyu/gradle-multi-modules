package org.example.member.application;

import lombok.RequiredArgsConstructor;
import org.example.member.domain.Member;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApiFacade {
    private final MemberService memberService;

    public void saveMember() {
        memberService.saveMember();
    }

    public Member findMember() {
        return memberService.findMember();
    }
}
