package kr.ac.skunive.triplog.service;

import kr.ac.skunive.triplog.domain.DTO.MemberSignInDto;
import kr.ac.skunive.triplog.domain.entity.MemberSign;
import kr.ac.skunive.triplog.repository.MemberInfoRepository;
import kr.ac.skunive.triplog.repository.MemberSignRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignService {

    private final MemberSignRepository memberSignRepository;
    private final MemberInfoRepository memberInfoRepository;

    public MemberSign signIn(MemberSignInDto memberSignInDto) throws Exception{

        return memberSignRepository.findByIdAndPw(memberSignInDto.getId(), memberSignInDto.getPw())
                .orElseThrow(() -> new Exception("Member not Exist"));

    }

    private MemberSign memberSignDto2MemberSign(MemberSignInDto memberSignInDto){
        return MemberSign.builder().id(memberSignInDto.getId()).pw(memberSignInDto.getPw()).build();
    }




}
