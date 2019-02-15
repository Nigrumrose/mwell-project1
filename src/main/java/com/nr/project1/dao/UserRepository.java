package com.nr.project1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nr.project1.domain.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
	User findByLoginId(String loginId);
}
