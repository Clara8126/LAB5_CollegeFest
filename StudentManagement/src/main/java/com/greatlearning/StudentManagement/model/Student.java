package com.greatlearning.StudentManagement.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Students")

public class Student {
		@Id	
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "ID")
		int id;
		@Column(name ="First_Name")
		String firstname;
		@Column(name="Last_Name")
		String lastname;
		@Column(name="Department")
		String department;
		@Column(name="Country")
		String country;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		
			
		
		}

