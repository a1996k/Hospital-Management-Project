package com.csye6220.esdproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@Controller
@RequestMapping("/api")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	@GetMapping("/doctor")
	public List<Doctor> get() {
		return doctorService.get();
	}

	@GetMapping("/doctors")
	public String getList(ModelMap model) {
		List<Doctor> doctor = doctorService.get();

		model.addAttribute("doctor", doctor);
		return "doctorList";
	}

	@RequestMapping("/doctor-form")
	public String Addreception() {
		return "doctorForm";
	}
	@PostMapping("/add-doctor")
	public String save(@RequestParam("doctorName") String doctorName,
			@RequestParam("doctorDepartment") String doctorDepartment, @RequestParam("dob") String dob,
			@RequestParam("gender") String gender, @RequestParam("email") String email,
			@RequestParam("mobileNumber") String mobileNumber, @RequestParam("userName") String userName,
			@RequestParam("password") String password) {
		Doctor doctorObj = new Doctor();
		doctorObj.setDoctorName(doctorName);
		doctorObj.setDoctorDepartment(doctorDepartment);
		doctorObj.setDob(dob);
		doctorObj.setGender(gender);
		doctorObj.setEmail(email);
		doctorObj.setMobileNumber(mobileNumber);
		doctorObj.setUserName(userName);
		doctorObj.setPassword(password);
		
		doctorService.save(doctorObj);

		return "redirect:/api/doctor";
	}
	
	@GetMapping("/doctor/{id}")
	public Doctor get(@PathVariable int id) {
		Doctor doctorObj = doctorService.get(id);
		if (doctorObj == null)
			throw new RuntimeException("Patient has been deleted with id : "+ id + " not found");

		return doctorObj;
	}

	@GetMapping("/edit-doctor/{id}")
	public String update(@PathVariable int id, Model model) {
		Doctor doctor = doctorService.get(id);
		model.addAttribute("doctor", doctor);
		return "editDoctorForm";
	}

	@PostMapping("/saveedit-doctor/{id}")
    public String editUserSubmit(@PathVariable int id, @ModelAttribute Doctor doctor, Model model) {

		doctor.setId(id);       
		doctorService.save(doctor);
        model.addAttribute("message", "Reception updated successfully");
        return "redirect:/api/receptionlist";
    }
	@GetMapping("/delete-doctor/{id}")
	public String delete(@PathVariable int id) {
		doctorService.delete(id);
		return "redirect:/api/doctor";
	}

	

}
