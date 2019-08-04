package kr.ac.skunive.triplog.repository;

import kr.ac.skunive.triplog.domain.entity.MemberInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberInfoRepository extends JpaRepository<MemberInfo, Long> {

}
