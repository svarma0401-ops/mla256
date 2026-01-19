package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())
            
            
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/login.html", "/js/**").permitAll()
                .requestMatchers("/admin.html").hasRole("ADMIN")
                .requestMatchers("/user.html").hasAnyRole("ADMIN","USER")
                .requestMatchers(HttpMethod.GET, "/employee/**").hasAnyRole("ADMIN","USER")
                .requestMatchers(HttpMethod.POST, "/employee/**").hasRole("ADMIN")
                .requestMatchers(HttpMethod.PUT, "/employee/**").hasRole("ADMIN")
                .requestMatchers(HttpMethod.DELETE, "/employee/**").hasRole("ADMIN")
                .anyRequest().authenticated()
            )

            .formLogin(login -> login
                .loginPage("/login.html")           
                .loginProcessingUrl("/login")       
                .defaultSuccessUrl("/redirect", true) 
                .permitAll()
            )

            .logout(logout -> logout
                .logoutSuccessUrl("/login.html")
            );

        return http.build();
    }
}
