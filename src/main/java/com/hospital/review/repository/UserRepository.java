package com.hospital.review.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.review.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

    Optional<User> findByUserName(String userName);
}
