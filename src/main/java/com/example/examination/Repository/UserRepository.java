package com.example.examination.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.examination.Model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

}