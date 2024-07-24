package com.excelr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payment_table")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int eid;
	private String ename;
	private String email;
	private long mobileNo;
	private String address;
	private int companyId;
	Payment() {
		super();
	}
	Payment(int eid, String ename, String email, long mobileNo, String address, int companyId) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.mobileNo = mobileNo;
		this.address = address;
		this.companyId = companyId;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	@Override
	public String toString() {
		return "Payment [eid=" + eid + ", ename=" + ename + ", email=" + email + ", mobileNo=" + mobileNo + ", address="
				+ address + ", companyId=" + companyId + "]";
	}
	

}
