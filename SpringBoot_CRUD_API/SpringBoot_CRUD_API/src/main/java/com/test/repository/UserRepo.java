package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.entity.User;
import java.util.*;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
