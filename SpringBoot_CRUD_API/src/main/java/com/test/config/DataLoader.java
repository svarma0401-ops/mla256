package com.test.config;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.test.repository.*;
import com.test.entity.*;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private RoleRepo roleRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder encoder;

    @Override
    public void run(String... args) {
        if(roleRepo.count() == 0) {

            Role adminRole = roleRepo.save(new Role(null, "ROLE_ADMIN"));
            Role userRole  = roleRepo.save(new Role(null, "ROLE_USER"));

            User admin = new User(null, "admin", encoder.encode("admin123"), Set.of(adminRole));
            User user  = new User(null, "user",  encoder.encode("user123"),  Set.of(userRole));

            userRepo.save(admin);
            userRepo.save(user);
        }
    }
}
