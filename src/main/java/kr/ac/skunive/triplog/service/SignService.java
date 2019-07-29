package kr.ac.skunive.triplog.service;

import kr.ac.skunive.triplog.domain.DTO.MemberSignDto;
import kr.ac.skunive.triplog.repository.MemberInfoRepository;
import kr.ac.skunive.triplog.repository.MemberSignRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignService {

    private final MemberSignRepository memberSignRepository;
    private final MemberInfoRepository memberInfoRepository;

    public void SignIn(MemberSignDto memberSignDto){



    }


}
