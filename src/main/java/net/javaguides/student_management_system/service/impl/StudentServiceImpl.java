package net.javaguides.student_management_system.service.impl;

import org.springframework.stereotype.Service;

import net.javaguides.student_management_system.entity.Student;
import net.javaguides.student_management_system.repository.StudentRepository;

import java.util.List;

import net.javaguides.student_management_system.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	@Override
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
}
 