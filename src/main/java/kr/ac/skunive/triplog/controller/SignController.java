package kr.ac.skunive.triplog.controller;

import kr.ac.skunive.triplog.domain.DTO.MemberSignInDto;
import kr.ac.skunive.triplog.domain.entity.MemberInfo;
import kr.ac.skunive.triplog.domain.entity.MemberSign;
import kr.ac.skunive.triplog.service.SignService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/triplog")
public class SignController {

    private final SignService signService;

    @PostMapping("/signin")
    public MemberSign signIn(@RequestBody MemberSignInDto memberSignInDto) throws Exception{

        return signService.signIn(memberSignInDto);
    }

//    @PostMapping("/singup")
//    public MemberInfo signUp(@RequestBody )
}
