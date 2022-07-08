package com.mts.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admissioncommiteemember")
public class AdmissionCommiteeMember {
	@Id
	private int adminId;
	private String adminName;
	private String adminContact;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	@Override
	public String toString() {
		return "AdmissionCommiteeMember [adminId=" + adminId + ", adminName=" + adminName + ", adminContact="
				+ adminContact + "]";
	}
	public String getAdminContact() {
		return adminContact;
	}
	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}
	
}

