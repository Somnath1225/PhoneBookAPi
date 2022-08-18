package com.BikkadIT.PhoneBookApi1.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Contact_Details")
public class Contact {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer contactId;
	
	private String contactName;
	
	private String contactNumber;
	
	private String contactEmail;
	
	private Character activeSwitch;
	
	private LocalDate createdDate;
	
	private LocalDate  updateDate;

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Character getActiveSwitch() {
		return activeSwitch;
	}

	public void setActiveSwitch(Character activeSwitch) {
		this.activeSwitch = activeSwitch;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	public Contact(Integer contactId, String contactName, String contactNumber, String contactEmail,
			Character activeSwitch, LocalDate createdDate, LocalDate updateDate) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactNumber = contactNumber;
		this.contactEmail = contactEmail;
		this.activeSwitch = activeSwitch;
		this.createdDate = createdDate;
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactNumber=" + contactNumber
				+ ", contactEmail=" + contactEmail + ", activeSwitch=" + activeSwitch + ", createdDate=" + createdDate
				+ ", updateDate=" + updateDate + "]";
	}
	
	

}
