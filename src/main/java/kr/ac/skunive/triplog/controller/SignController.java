package kr.ac.skunive.triplog.controller;

import kr.ac.skunive.triplog.service.SignService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SignController {

    private final SignService signService;


}
