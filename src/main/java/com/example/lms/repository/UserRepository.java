package com.example.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lms.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}