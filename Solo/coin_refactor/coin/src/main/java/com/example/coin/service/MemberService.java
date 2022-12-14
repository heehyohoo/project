package com.example.coin.service;


import com.example.coin.dto.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.coin.repository.MemberRepository;

@Service
public class MemberService {

    MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public int insertMember(Member member) {
        return memberRepository.insertMember(member);
    }

    public int checkEmail(String email) {
        return memberRepository.checkEmail(email);
    }

    public int checkMember(Member member) {
        return memberRepository.checkMember(member);
    }
}
