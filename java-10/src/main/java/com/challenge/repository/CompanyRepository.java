package com.challenge.repository;

import com.challenge.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    List<Company> findDistinctByCandidatesIdAccelerationId(Long accelerationId);

    List<Company> findByCandidatesIdUserId(Long userId);

    
    @Query("select distinct com from Company com " +
            " join com.accelerations as acc " +
            " join acc.candidates can " +
            " join can.id.user user " +
            " where acc.id = :accelerationId")
	List<Company> findByAccelerationId(@Param("accelerationId")Long accelerationId);

    @Query("select distinct com from Company com " +
            " join com.candidates can " +
            " join can.id.user user " +
            "where user.id = :userId") 
	List<Company> findByUserId(@Param("userId")Long userId);

}
