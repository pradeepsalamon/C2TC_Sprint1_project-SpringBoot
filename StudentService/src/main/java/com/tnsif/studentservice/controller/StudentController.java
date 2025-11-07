package com.tnsif.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.tnsif.studentservice.entity.Student;
import com.tnsif.studentservice.service.StudentService;
import jakarta.persistence.NoResultException;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping
	public List<Student> list(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> get(@PathVariable int id){
		try {
			Student s = service.get(id);
			return new ResponseEntity<Student>(s, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public void add(@RequestBody Student newStudent) {
		service.save(newStudent);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Student> update(@PathVariable int id, @RequestBody Student u_s){
		try {
			Student e_s = service.get(id);
			e_s.setId(u_s.getId());
			e_s.setAddress(u_s.getAddress());
			e_s.setCity(u_s.getCity());
			e_s.setDept(u_s.getDept());
			e_s.setDob(u_s.getDob());
			e_s.setName(u_s.getName());
			e_s.setReg_no(u_s.getReg_no());
			service.update(e_s);
			return new ResponseEntity<Student>(e_s,HttpStatus.OK);
		} catch (NoResultException e) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		service.delete(id);
	}

}
