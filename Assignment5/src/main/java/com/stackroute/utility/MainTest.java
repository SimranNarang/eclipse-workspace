package com.stackroute.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		Student s1=new Student(1,"student1",23);
		Student s2=new Student(12,"student2",24);
		Student s3=new Student(31,"student8",25);
		Student s4=new Student(64,"student4",26);
		Student s5=new Student(4,"student5",26);
		Student s6=new Student(84,"student6",20);
		Student s7=new Student(40,"student7",21);
		Student s8=new Student(49,"student8",25);
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		studentList.add(s7);
		studentList.add(s8);
		Collections.sort(studentList,new StudentSorter());  
		for (Student student : studentList) {
			System.out.println(student.toString());
		}
		
	}
}
