package com.spring.core;

public class Student
{
private int studentId;
private String studentname;
private String studentAddress;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}
public Student(int studentId, String studentname, String studentAddress) {
	super();
	this.studentId = studentId;
	this.studentname = studentname;
	this.studentAddress = studentAddress;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentname=" + studentname + ", studentAddress=" + studentAddress
			+ "]";
}

}
