package net.javaguides.student_management_system.service;

import java.util.List;
import net.javaguides.student_management_system.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
}

