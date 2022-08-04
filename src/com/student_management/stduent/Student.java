package com.student_management.stduent;

import java.sql.Connection;
import java.sql.DriverManager;

public class Student {
  
	private int  id;
	private String name;
	private int rollno;
	private String className;
	private String grade;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	// Constructor
	public Student(int id, String name, int rollno, String className, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.className = className;
		this.grade = grade;
	}

	public Student(String name, int rollno, String className, String grade) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.className = className;
		this.grade = grade;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + ", className=" + className + ", grade="
				+ grade + "]";
	}
	
}
