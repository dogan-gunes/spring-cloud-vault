package com.dgn.vaultdemo.repository;

import com.dgn.vaultdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
