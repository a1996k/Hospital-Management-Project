package com.csye6220.esdproject.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name = "tbl_employee")
//@Table(name = "patient_table")
@Table(name = "patient_table")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String firstName;
	@Column
	private String middleName;
	@Column
	private String lastName;
	@Column
	private LocalDate dob;
	@Column
	private String gender;
	@Column
	private String email;
	@Column
	private String mobileNumber;
	@Column
	private String photoID;//(optional)
	@Column
	private String country;
	@Column
	private String state;
	@Column
	private String city;
	@Column
	private String residentialAddress;
	@Column
	private String permanentAddress;
	@Column
	private String bloodGroop;
	@Column
	private String chronicDiseases;
	@Column
	private String medicalAllergy;
	@Column
	private String assignedDoctor;
	@Column
	private String symptoms;
	@Column
	private String diagnosis;
	@Column
	private String medicineAndDossage;
	@Column
	private String dos;
	@Column
	private String donts;
	@Column
	private String investigations;
	@Column
	private LocalDate followUpDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPhotoID() {
		return photoID;
	}
	public void setPhotoID(String photoID) {
		this.photoID = photoID;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getBloodGroop() {
		return bloodGroop;
	}
	public void setBloodGroop(String bloodGroop) {
		this.bloodGroop = bloodGroop;
	}
	public String getChronicDiseases() {
		return chronicDiseases;
	}
	public void setChronicDiseases(String chronicDiseases) {
		this.chronicDiseases = chronicDiseases;
	}
	public String getMedicalAllergy() {
		return medicalAllergy;
	}
	public void setMedicalAllergy(String medicalAllergy) {
		this.medicalAllergy = medicalAllergy;
	}
	public String getAssignedDoctor() {
		return assignedDoctor;
	}
	public void setAssignedDoctor(String assignedDoctor) {
		this.assignedDoctor = assignedDoctor;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getMedicineAndDossage() {
		return medicineAndDossage;
	}
	public void setMedicineAndDossage(String medicineAndDossage) {
		this.medicineAndDossage = medicineAndDossage;
	}
	public String getDos() {
		return dos;
	}
	public void setDos(String dos) {
		this.dos = dos;
	}
	public String getDonts() {
		return donts;
	}
	public void setDonts(String donts) {
		this.donts = donts;
	}
	public String getInvestigations() {
		return investigations;
	}
	public void setInvestigations(String investigations) {
		this.investigations = investigations;
	}
	public LocalDate getFollowUpDate() {
		return followUpDate;
	}
	public void setFollowUpDate(LocalDate followUpDate) {
		this.followUpDate = followUpDate;
	}
}
