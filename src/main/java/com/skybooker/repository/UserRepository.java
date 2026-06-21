package com.skybooker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skybooker.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}