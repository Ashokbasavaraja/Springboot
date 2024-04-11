package com.sjprogramming.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sjprogramming.restapi.studentrepository;
import com.sjprogramming.restapi.entity.Student;


@RestController
 
public class StudentController {
	@Autowired
	
	studentrepository repo;
	@GetMapping("/students")
	public List<Student>getAllStudents()
	{
		List<Student> students=  repo.findAll();
		return students;
		
	}
	
@GetMapping("/students/{id}")
public Student getstudent(@PathVariable int id) { 
 Student student=repo.findById(id).get();
 return student;

}
@PostMapping("/student/add")
public void createStudent(@RequestBody Student student) {
	repo.save(student);
}
@PutMapping("student/update{id}")
public Student upadteStudents(@PathVariable int id) {
	Student student=repo.findById(id).get();
	student.setName("shivaji");
	student.setPercentage(25);
	repo.save(student);
	return student;
}

@DeleteMapping("student/delete{id}")

	public void removeStudent(@PathVariable int id )
	{
		Student student=repo.findById(id).get();
		repo.delete(student);
	}
}

