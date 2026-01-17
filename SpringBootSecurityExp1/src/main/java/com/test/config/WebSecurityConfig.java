package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	@Bean
	protected UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
		UserDetails user = User.builder()
				.username("USER")
				.password(passwordEncoder().encode("abc123"))
				.roles("USER")
				.build();
		
		UserDetails admin = User.builder()
				.username("ADMIN")
				.password(passwordEncoder().encode("java"))
				.roles("ADMIN","USER")
				.build();
		return new InMemoryUserDetailsManager(user,admin);
	}
	
	@Bean
	protected PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	protected SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) {
		return httpSecurity
				.csrf(AbstractHttpConfigurer :: disable)
				.authorizeHttpRequests(request -> request
				.requestMatchers("/login").permitAll()
				.requestMatchers("/**")
				.authenticated()
				)
				
	.formLogin(form -> form.loginPage("/login")
			.defaultSuccessUrl("/")
			.failureUrl("/login?error")
			.permitAll())
	.logout(config -> config.logoutUrl("/logout")
			.logoutSuccessUrl("/login"))
	.build();
	
	}
}
