package com.example.examination.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.examination.Model.Tests;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TestRepository extends JpaRepository<Tests, Long> {
    Optional<Tests> findByTestId(UUID testId);
}
