package com.excelr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Institute {
	@Id
	private int instituteId;
	private String instituteName;
	private String address;
	private long contactNo;
	private String websiteName;
	Institute() {
		super();
	}
	Institute(int instituteId, String instituteName, String address, long contactNo, String websiteName) {
		super();
		this.instituteId = instituteId;
		this.instituteName = instituteName;
		this.address = address;
		this.contactNo = contactNo;
		this.websiteName = websiteName;
	}
	public int getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getWebsiteName() {
		return websiteName;
	}
	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}
	@Override
	public String toString() {
		return "Institute [instituteId=" + instituteId + ", instituteName=" + instituteName + ", address=" + address
				+ ", contactNo=" + contactNo + ", websiteName=" + websiteName + "]";
	}
	

}
