package com.challenge.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.challenge.entity.Submission;

@Repository
public interface SubmissionRepository extends JpaRepository<Submission, Long> {
	
	//@Query("select max(sub) from Submission sub " +
    //        " where sub.challenge_id = :challengeId")
	//public abstract BigDecimal findHigherScoreByChallengeId(@Param("challengeId")Long challengeId);
	
	/*
	 * @Query("select distinct sub from Submission sub" +
	 * "join sub.challenge as cha" + "join cha.accelerations acc" +
	 * "where cha.id = :challengeId and acc.id = :accelerationId") public abstract
	 * List<Submission> findByChallengeIdAndAccelerationId(@Param("challengeId")Long
	 * challengeId, @Param("accelerationId")Long accelerationId);
	 */

}
