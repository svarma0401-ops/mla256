package com.test.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.test.entity.Student;

@Transactional
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	@Query("select s from Student s where s.name = :name")
	public Optional<Student> getStudentByName(@Param("name") String name);
	 
	@Query("select s from Student s where s.department = :department")
	public List<Student> getStudentByDepartment(@Param("department") String department);
}
