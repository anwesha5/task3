package com.submission.task3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.submission.task3.entity.Tests_valEntity;

public interface TestsvalRepository extends JpaRepository<Tests_valEntity, Integer> {
    List<Tests_valEntity> findByTestidAndGenderAndUnit(Integer testid, String gender, String unit);
}
