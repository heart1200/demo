package com.school.test;

import com.school.Student;
import com.school.Subject;

public class SubjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new Subject("计算机应用","1000010",4);
		Student student = new Student("luoweilin", "100012", "女", 18,subject);
		System.out.println(subject.info());
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println(student.introduce());
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println(student.introduce(subject));
	}

}
