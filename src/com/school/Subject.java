package com.school;

public class Subject {
	private String subjectName;
	private String subjectNo;
	private int subjectYear;
	private Student students[];
	private int studentNum;
	
	public Subject() {
		
	}
	
	public Subject(String subjectName, String subjectNo, int subjectYear) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectYear(subjectYear);
		
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectNname) {
		this.subjectName = subjectNname;
	}
	public String getSubjectNo() {
		return subjectNo;
	}
	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}
	public int getSubjectYear() {
		return subjectYear;
	}
	public void setSubjectYear(int subjectYear) {
		if(subjectYear<=0 && subjectYear>5)
			return;
		this.subjectYear = subjectYear;
	}
	
	public Student[] getStudents() {
		if (students ==null) {
			this.students = new Student[200];
		}
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public int getStudentNum() {
		return studentNum;	
	}       

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String info() {
		return "专业信息如下：\n专业学科名："+getSubjectName()
				+ "\n专业学科编号："+getSubjectNo()+"\n专业学科学制:"
				+getSubjectYear();
	}
	
	//将学生添加进入数组
	public void addStudents(Student stu) {
		int i;
		for(i = 0;i < this.getStudents().length;i++) {
			if(this.getStudents()[i] == null) {
				this.getStudents()[i] = stu;
				this.studentNum = i+1;
				break;
			}
		}
	}

}



