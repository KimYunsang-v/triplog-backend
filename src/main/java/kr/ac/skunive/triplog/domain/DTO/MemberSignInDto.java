package kr.ac.skunive.triplog.domain.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberSignInDto {

    private String id;

    private String pw;
}
