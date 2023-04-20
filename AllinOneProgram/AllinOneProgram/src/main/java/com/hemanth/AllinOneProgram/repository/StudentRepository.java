package com.hemanth.AllinOneProgram.repository;

import com.hemanth.AllinOneProgram.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>
{

}
