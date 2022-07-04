package com.greatlearning.StudentManagement.service;
import java.util.List;

import com.greatlearning.StudentManagement.model.Student;
public interface StudentService {

	public List<Student> listAllData();
	public void save(Student s1);
	public Student delete(int id);
	public Student getStudentDetails(int id);

}
