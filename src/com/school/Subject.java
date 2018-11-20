package com.school;

public class Subject {
	private String subjectName;
	private String subjectNo;
	private int subjectYear;
	
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
	
	public String info() {
		return "专业信息如下：\n专业学科名："+getSubjectName()
				+ "\n专业学科编号："+getSubjectNo()+"\n专业学科学制:"
				+getSubjectYear();
	}

}
