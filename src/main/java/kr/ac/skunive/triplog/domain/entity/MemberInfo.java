package kr.ac.skunive.triplog.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberInfo {

    @Id @GeneratedValue
    private Long memberInfoId;

    private String name;

    private String birth;

    private String gender;

    private String email;

    @OneToOne
    private MemberSign memberSignId;
}
