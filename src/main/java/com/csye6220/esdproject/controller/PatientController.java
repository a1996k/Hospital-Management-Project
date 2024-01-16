package com.csye6220.esdproject.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.csye6220.esdproject.model.Doctor;
import com.csye6220.esdproject.model.Patient;
import com.csye6220.esdproject.service.DoctorService;
import com.csye6220.esdproject.service.PatientService;

@Controller
@RequestMapping("/api")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	@Autowired
	private DoctorService doctorService;
	
	@GetMapping("/patient")
	public List<Patient> get(){
		return patientService.get();
	}
	
	@GetMapping("/patients")
	public String getList(ModelMap model){
		List<Patient> patient = patientService.get();
		
		model.addAttribute("patient", patient);
		return "patientList";
	}
	
	@PostMapping("/add-patient")
	public String save(@RequestParam("firstName") String firstName, 
						@RequestParam("middleName") String middleName,
						@RequestParam("lastName") String lastName,
						@RequestParam("gender") String gender,
						@RequestParam("email") String email,
						@RequestParam("mobileNumber") String mobileNumber,
						@RequestParam("photoID") String photoID,
						@RequestParam("country") String country,
						@RequestParam("state") String state,
						@RequestParam("city") String city,
						@RequestParam("residentialAddress") String residentialAddress,
						@RequestParam("permanentAddress") String permanentAddress,
						@RequestParam("bloodGroop") String bloodGroop,
						@RequestParam("chronicDiseases") String chronicDiseases,
						@RequestParam("medicalAllergy") String medicalAllergy,
						@RequestParam("doctor-dropdown") String assignedDoctor,
						@RequestParam("dob") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dob)
	{
		Patient patientObj = new Patient(); 
		patientObj.setFirstName(firstName);
		patientObj.setMiddleName(middleName);
		patientObj.setLastName(lastName);
		patientObj.setDob(dob);
		patientObj.setGender(gender);
		patientObj.setEmail(email);
		patientObj.setMobileNumber(mobileNumber);
		patientObj.setPhotoID(photoID);
		patientObj.setCountry(country);
		patientObj.setState(state);
		patientObj.setCity(city);
		patientObj.setResidentialAddress(residentialAddress);
		patientObj.setPermanentAddress(permanentAddress);
		patientObj.setBloodGroop(bloodGroop);
		patientObj.setChronicDiseases(chronicDiseases);
		patientObj.setMedicalAllergy(medicalAllergy);
		patientObj.setAssignedDoctor(assignedDoctor);

		patientService.save(patientObj);
		return "redirect:/api/patients";
	}
	
	@GetMapping("/patient/{id}")
	public Patient get(@PathVariable int id) {
		Patient patientObj = patientService.get(id);
		if (patientObj == null)
			throw new RuntimeException("Patient has been deleted with id : "+ id + " not found");

		return patientObj;
	}
	
	@GetMapping("/edit-patient/{id}")
	public String update(@PathVariable int id, Model model)
	{
		Patient patient = patientService.get(id);
		model.addAttribute("patient", patient);
		return "editPatientForm";
	}
	
	@PostMapping("/edit/{id}")
    public String editUserSubmit(@PathVariable int id, @ModelAttribute Patient patient, Model model) {

		patient.setId(id);       
		patientService.save(patient);
        model.addAttribute("message", "Patient updated successfully");
        return "redirect:/api/patients";
    }
	
	@GetMapping("/delete-patient/{id}")
	public String delete(@PathVariable int id)
	{
		System.out.println("ID  : " + id);
		patientService.delete(id);
		return "redirect:/api/patients";
	}
	
	@RequestMapping("/patient-form")
	public String Addpatient(ModelMap model) {
		List<Doctor> doctor = doctorService.get();
		model.addAttribute("doctor", doctor);
		return "patientForm";
	}
	
//	@RequestMapping("/patient-fname")
//	public String PatientFName(Model model) {
//		List<String> FNames = patientService.get("SELECT p.firstName FROM Patient p");
//		System.out.println(Arrays.toString(FNames.toArray()));
//		model.addAttribute("FNames", FNames);
//		return "appointment";
//	}
	
}
