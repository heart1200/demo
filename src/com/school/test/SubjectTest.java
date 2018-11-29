package com.school.test;

import com.school.Student;
import com.school.Subject;

public class SubjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new Subject("计算机应用","1000010",4);
		Student student1 = new Student("luoweilin", "100012", "女", 18,subject);
		Student student2 = new Student("luodayu", "100012", "n", 20,subject);
		Student student3 = new Student("liyange", "100012", "女", 19,subject);
		Student student4 = new Student("luoqicui", "100012", "n", 18,subject);
//		System.out.println(subject.info());
//		System.out.println("+++++++++++++++++++++++++++++++++++++");
//		System.out.println(student.introduce());
//		System.out.println("+++++++++++++++++++++++++++++++++++++");
//		System.out.println(student.introduce(subject));
		subject.addStudents(student1);
		subject.addStudents(student2);
   		subject.addStudents(student3);
		subject.addStudents(student4);
		System.out.println(subject.getStudentNum());
	}

}
