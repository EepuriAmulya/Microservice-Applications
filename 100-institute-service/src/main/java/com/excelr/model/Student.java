package com.excelr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="std_table")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int sid;
	private String name;
	private long mobileNo;
	private String email;
	private String courseName;
	private double fee;
	private int duration;
	private int instituteCenterId;
	Student() {
		super();
	}
	Student(int sid, String name, long mobileNo, String email, String courseName, double fee, int duration,
			int instituteCenterId) {
		super();
		this.sid = sid;
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;
		this.courseName = courseName;
		this.fee = fee;
		this.duration = duration;
		this.instituteCenterId = instituteCenterId;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getInstituteCenterId() {
		return instituteCenterId;
	}
	public void setInstituteCenterId(int instituteCenterId) {
		this.instituteCenterId = instituteCenterId;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", mobileNo=" + mobileNo + ", email=" + email
				+ ", courseName=" + courseName + ", fee=" + fee + ", duration=" + duration + ", instituteCenterId="
				+ instituteCenterId + "]";
	}

}
