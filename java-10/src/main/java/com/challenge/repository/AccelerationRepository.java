package com.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.challenge.entity.Acceleration;

@Repository
public interface AccelerationRepository extends JpaRepository<Acceleration, Long> {

	@Query(value = "SELECT ac.* " +
            "FROM Acceleration ac " +
            "INNER JOIN Candidate ca " +
            "ON ac.id = ca.acceleration_id " +
            "INNER JOIN Company co " +
            "ON co.id = ca.company_id AND co.id = :companyId",
            nativeQuery = true)
	public List<Acceleration> findByCompanyId(@Param("companyId")Long companyId);
}
