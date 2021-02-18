package com.simplilearn.phase3end.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.phase3end.model.UserEntity;

public interface UserEntityRepository extends JpaRepository<UserEntity, Integer> {
	Optional<UserEntity> findByUserName(String userName);
}

