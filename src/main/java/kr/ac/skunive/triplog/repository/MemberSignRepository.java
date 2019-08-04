package kr.ac.skunive.triplog.repository;

import kr.ac.skunive.triplog.domain.entity.MemberSign;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberSignRepository extends JpaRepository<MemberSign, Long> {

    Optional<MemberSign> findByIdAndPw(String id, String pw);


}
