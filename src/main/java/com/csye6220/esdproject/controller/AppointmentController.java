package com.csye6220.esdproject.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.csye6220.esdproject.model.Appointment;
import com.csye6220.esdproject.model.Doctor;
import com.csye6220.esdproject.model.Patient;
import com.csye6220.esdproject.service.AppointmentService;
import com.csye6220.esdproject.service.DoctorService;
import com.csye6220.esdproject.service.PatientService;

@Controller
@RequestMapping("/api")
public class AppointmentController {

	@Autowired
	private PatientService patientService;
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private AppointmentService appointmentService;
	
//	@RequestMapping("/patient-fname")
//	public String PatientFName(Model model) {
//		List<String> FNames = patientService.get("SELECT p.firstName FROM Patient p");
////		System.out.println(Arrays.toString(FNames.toArray()));
//		model.addAttribute("FNames", FNames);
//		return "appointment";
//	}
	
	@GetMapping("/appointment")
	public String getList(ModelMap model){
		List<Patient> patient = patientService.get();
		List<Doctor> doctor = doctorService.get();
		
		model.addAttribute("patient", patient);
		model.addAttribute("doctor", doctor);
		return "appointment";
	}
	
	@GetMapping("/appointmentDetails")
	public String getAppointmentDetails(ModelMap model, @RequestParam("patient-dropdown") int patientID, 
										@RequestParam("doctor-dropdown") int doctorID)
	{
		System.out.println("patientID : " + patientID);
		System.out.println("doctorID : " + doctorID);
		
		Patient patient = patientService.get(patientID);
		Doctor doctor = doctorService.get(doctorID);

		
		model.addAttribute("patient", patient);
		model.addAttribute("doctor", doctor);
		
	
		return "appointmentBook";
	}
	
	@GetMapping("/bookAppointment/{pID}/{dID}")
	public String BookAppointment(ModelMap model, @PathVariable("pID") int pID, @PathVariable("dID") int dID) {
		Doctor doctorObj = doctorService.get(dID);
		Patient patientObj = patientService.get(pID);
//		if ((doctorObj == null)||(patientObj == null))
//			throw new RuntimeException("Patient or Doctor has been deleted with id : "+ dID +"  "+ pID +" not found");
		System.out.println("/bookAppointment/{pID}/dID");
		System.out.println("DoctorID : " + doctorObj.getId());
		System.out.println("Doctor : " + doctorObj.getDoctorName());
		System.out.println("PatientID : " + patientObj.getId());
		System.out.println("Patient : " + patientObj.getFirstName()+" "+ patientObj.getMiddleName()+" "+ patientObj.getLastName());
		
		model.addAttribute("patient", patientObj);
		model.addAttribute("doctor", doctorObj);
		return "appointmentForm";
	}
	
	@PostMapping("/save-bookedAppointment")
	public String save(@RequestParam("patientName") String patientName, 
						@RequestParam("patientID") int patientID,
						@RequestParam("doctorName") String doctorName,
						@RequestParam("doctorID") int doctorID,
						@RequestParam("symptoms") String symptoms,
						@RequestParam("gender") String gender,
						@RequestParam("diagnosis") String diagnosis,
						@RequestParam("medicinesDose") String medicinesDose,
						@RequestParam("dos") String dos,
						@RequestParam("donts") String donts,
						@RequestParam("investigations") String investigations,
						@RequestParam("followupDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate followupDate)
	{
		System.out.println(patientName);
		System.out.println(patientID);
		System.out.println(doctorName);
		System.out.println(patientName);
		System.out.println(symptoms);
		System.out.println(gender);
		System.out.println(medicinesDose);
		System.out.println(dos);
		System.out.println(donts);
		System.out.println(investigations);
		System.out.println(followupDate);
		
		Appointment appointmentobj = new Appointment();
		appointmentobj.setPatientName(patientName);
		appointmentobj.setPatientId(patientID);
		appointmentobj.setDoctorName(doctorName);
		appointmentobj.setDoctorId(doctorID);
		appointmentobj.setSymptoms(symptoms);
		appointmentobj.setDiagnosis(diagnosis);
		appointmentobj.setMedicinesDose(medicinesDose);
		appointmentobj.setDos(dos);
		appointmentobj.setDonts(donts);
		appointmentobj.setInvestigations(investigations);
		appointmentobj.setFollowupDate(followupDate);
		
		appointmentService.save(appointmentobj);
		return null;
	
	}
	
	
}
