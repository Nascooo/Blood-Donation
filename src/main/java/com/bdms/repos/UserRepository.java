package com.bdms.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bdms.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findUserByUserName(String userName);
}
