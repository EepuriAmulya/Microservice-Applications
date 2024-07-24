package com.excelr.model;

import java.util.List;

public class RequiredResponse {
	private Institute institute;
	private List<Student> students;
	public RequiredResponse() {
		super();
	}
	RequiredResponse(Institute institute, List<Student> students) {
		super();
		this.institute = institute;
		this.students = students;
	}
	public Institute getInstitute() {
		return institute;
	}
	public void setInstitute(Institute institute) {
		this.institute = institute;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "RequriedResponse [institute=" + institute + ", students=" + students + "]";
	}
	
	
}
