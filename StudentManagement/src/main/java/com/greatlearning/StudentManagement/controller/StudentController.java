package com.greatlearning.StudentManagement.controller;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.StudentManagement.model.Student;
import com.greatlearning.StudentManagement.service.StudentServiceImpl;



@Controller
@RequestMapping("/students")

public class StudentController {
	@Autowired
	StudentServiceImpl io;
	
		@RequestMapping("/list")
		public String getAllStudent( Model theModel) {
		List<Student> L1 = io.listAllData();
			theModel.addAttribute("StudentModel", L1);
			return "StudentList";
		}

		@RequestMapping("/add")
		public String addStudent(Model theModel) {
			Student student = new Student();
			theModel.addAttribute("Student", student);
			return "StudentSave";
		}

		@RequestMapping("/update")
		public String updateStudent(@RequestParam("id") int id,Model theModel) {
			Student student = io.getStudentDetails(id);
			theModel.addAttribute("Student", student);
			System.out.println(student.getId()+ "Id");
			return "StudentSave";
		}
  
	
		@PostMapping("/save")
		public String saveStudent(@RequestParam("id") int id, 
	  @RequestParam("FirstName") String Firstname,
		@RequestParam("LastName")String Lastname,
		@RequestParam("Department") String Department,
		@RequestParam("Country") String Country) {

			Student stu;
			if (id != 0) {
				stu = io.getStudentDetails(id);	
			}
			else {
			 stu = new Student();
			}
			
			stu.setFirstname(Firstname);
			stu.setLastname(Lastname);
			stu.setDepartment(Department);
			stu.setCountry(Country);
			io.save(stu);
			
			//System.out.println(id+" "+Firstname+" "+Lastname+" "+Department +""+Country );
			return "redirect:/students/list/";
		}
		@RequestMapping("/delete")
		public String deleteStudent(@RequestParam("id") int id) {
			io.delete(id);
			return "redirect:/students/list/";
		}

		
}
