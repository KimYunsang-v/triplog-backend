package kr.ac.skunive.triplog.controller;

import kr.ac.skunive.triplog.domain.DTO.MemberSignInDto;
import kr.ac.skunive.triplog.service.SignService;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SignControllerTest {

    @Autowired
    private SignService signService;

    @Test
    public void signInTest() throws Exception{

        MemberSignInDto memberSignInDto = MemberSignInDto.builder().id("kys").pw("111").build();

        assertThat(signService.signIn(memberSignInDto), CoreMatchers.is("success"));
    }

    @Test
    public void signInTest2() throws Exception{

        MemberSignInDto memberSignInDto = MemberSignInDto.builder().id("kys").pw("122").build();

        assertThat(signService.signIn(memberSignInDto), CoreMatchers.is("fail"));
    }
}