package com.csye6220.esdproject.model;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "appointment_table")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	int id;
	@Column
	int patientId;
	@Column
	String patientName;
	@Column
	int doctorId;
	@Column
	String doctorName;
	@Column
	String symptoms;
	@Column
	String diagnosis;
	@Column
	String medicinesDose;
	@Column
	String dos;
	@Column
	String donts;
	@Column
	String investigations;
	@Column
	LocalDate followupDate;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
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
	public String getMedicinesDose() {
		return medicinesDose;
	}
	public void setMedicinesDose(String medicinesDose) {
		this.medicinesDose = medicinesDose;
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
	public LocalDate getFollowupDate() {
		return followupDate;
	}
	public void setFollowupDate(LocalDate followupDate) {
		this.followupDate = followupDate;
	}
}
