package com.tnsif.studentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.studentservice.entity.Student;
import com.tnsif.studentservice.repository.StudentRepository;
import java.util.List;


@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	public List<Student> getAll(){
		return repo.findAll();		
	}
	
	public Student get(int id) {
		return repo.findById(id).get();
	}
	
	public void save( Student s) {
		repo.save(s);
	}
	
	public void update(Student s) {
		repo.save(s);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

}
