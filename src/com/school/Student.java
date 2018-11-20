package com.school;

public class Student {
	private String studentName;
	private String sutdentNo;
	private String studentGender;
	private int studentAge;
	private Subject studentSubject;
	
	public Student() {
		System.out.println(this.getStudentSubject().getSubjectYear());
	}

	public Student(String studentName, String sutdentNo, String studentGender, int studentAge, Subject studentSubject) {
		this.setStudentName(studentName);
		this.setSutdentNo(sutdentNo);
		this.setStudentGender(studentGender);
		this.setStudentAge(studentAge);
		this.setStudentSubject(studentSubject);
	}

	public Student(String studentName, String sutdentNo, String studentGender, int studentAge) {
		this.setStudentName(studentName);
		this.setSutdentNo(sutdentNo);
		this.setStudentGender(studentGender);
		this.setStudentAge(studentAge);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSutdentNo() {
		return sutdentNo;
	}

	public void setSutdentNo(String sutdentNo) {
		this.sutdentNo = sutdentNo;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		if (studentGender.equals("男")||studentGender.equals("女")) {
			this.studentGender = studentGender;
		}else{
			this.studentGender = "男";
		}
		
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		if (studentAge<=16 || studentAge>=24) {
			this.studentAge = 20;
		}else {
			this.studentAge = studentAge;
		}
	}
	
	public Subject getStudentSubject() {
		if (this.studentSubject==null) {
			Subject subject = new Subject();
			return subject;
		}else {
		return studentSubject;
		}
	}

	public void setStudentSubject(Subject studentSubject) {
		this.studentSubject = studentSubject;
	}

	public String introduce() {
		return "学生的详细信息如下:\n学生姓名："+this.getStudentName()+
				"\n学生年龄："+this.getStudentAge()+"\n学生性别："+
				this.getStudentGender()+"\n学号："+this.getSutdentNo()+
				"\n学生专业："+this.getStudentSubject().getSubjectName();
	}
	
	public String introduce(Subject subject) {
		return "学生的详细信息如下:\n学生姓名："+this.getStudentName()+
				"\n学生年龄："+this.getStudentAge()+"\n学生性别："+
				this.getStudentGender()+"\n学号："+this.getSutdentNo()+
				"\n学生的专业："+subject.getSubjectName()+"\n学制："+
				subject.getSubjectYear()+"年";
		
	}

}
