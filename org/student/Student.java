package org.student;

import org.department.Department;

public class Student extends Department{ 

	public void studentName()
	{
		System.out.println("studentName Leela");
	}
	public void studentdept()
	{
		System.out.println("studentDept Ece");
	}
	public void studenId()
	{
		System.out.println("studentId  Y19ec2626");
	}	
	
	public static void main(String[] args) {
		
	
	Student Total = new Student();

	Total.deptName();
	Total.collegeName();
	Total.collegeCode();
	Total.collegeRank();
	Total.studentName();
	Total.studentdept();
	Total.studenId();
}
}