package com.csye6220.esdproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.csye6220.esdproject.service.AdminService;
import com.csye6220.esdproject.service.DoctorService;
import com.csye6220.esdproject.service.ReceptionService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/api")
public class LoginController {
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private ReceptionService receptionService;
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/Login-Page")
	public String loginPage() {
		return "login";
	}
	
//	@RequestMapping("/patient-fname")
//	public String PatientFName(Model model) {
//		List<String> FNames = patientService.get("SELECT p.firstName FROM Patient p");
////		System.out.println(Arrays.toString(FNames.toArray()));
//		model.addAttribute("FNames", FNames);
//		return "appointment";
//	}
	
	@RequestMapping("/Login-Validate")
	public String loginValidate(HttpServletRequest request,@RequestParam("name") String name, 
			@RequestParam("password") String password,
			@RequestParam("loginRole") String loginRole) {
		
		HttpSession session = request.getSession();
        session.setAttribute("name", name);
        session.setAttribute("password", password);
        session.setAttribute("loginRole", loginRole);
        
		String lrDoctor = "doctor";
		String lrAdmin = "admin";
		String lrReceptionist = "receptionist";
		
//		System.out.println("loginValidate");
//		System.out.println(name);
//		System.out.println(password);
//		System.out.println("loginRole  - >"+loginRole);
		if(loginRole.compareTo(lrDoctor)==0)
		{
			System.out.println("name-->>>"+ name);
			System.out.println("password-->>>"+password);
			
			String pw = doctorService.getPassword(name);
			System.out.println("PW IN CONTROLLER -->  "+pw);
			if(password.compareTo(pw)==0)
			{
				System.out.println("session.getAttribute(\"name\")"+ session.getAttribute("name"));
				System.out.println("Password from the table   ->>>" + doctorService.getPassword(name));
				return "doctorHomePage";
			}
		}
		else if(loginRole.compareTo(lrReceptionist)==0)
		{
			System.out.println("Receptionistname-->>>"+ name);
			System.out.println("Receptionistpassword-->>>"+password);
			
			String pw = receptionService.getPassword(name);
			System.out.println("PW IN CONTROLLER -->  "+ pw);
			if(password.compareTo(pw)==0)
			{
				System.out.println("Password from the table   ->>>" + receptionService.getPassword(name));
				return "receptionHomePage";
			}	
		}
		else if(loginRole.compareTo(lrAdmin)==0)
		{
			System.out.println("Administname-->>>"+ name);
			System.out.println("Administpassword-->>>"+password);
			
			String pw = adminService.getPassword(name);
			System.out.println("PW IN CONTROLLER -->  "+ pw);
			if(password.compareTo(pw)==0)
			{
				System.out.println("Password from the table   ->>>" + adminService.getPassword(name));
				return "adminHomePage";
			}
		}
		return "welcome";
	}
	
	@RequestMapping("/DoctorsAppointment")
	public String DoctorsAppointment() {
		return "receptionLogin";
	}
	
	@RequestMapping("/Reception-LoginPage")
	public String ReceptionLoginPage() {
		return "receptionLogin";
	}
	
	@RequestMapping("/Doctor-LoginPage")
	public String DoctorLoginPage() {
		return "doctorLogin";
	}
	
	@RequestMapping("/Admin-LoginPage")
	public String AdminLoginPage() {
		return "adminLogin";
	}
	
	@RequestMapping("/Reception-HomePage")
	public String ReceptionHomePage() {
		return "receptionHomePage";
	}
	
	@RequestMapping("/Doctor-HomePage")
	public String DoctorHomePage() {
		return "doctorHomePage";
	}
	
	@RequestMapping("/Admin-HomePage")
	public String AdminHomePage() {
		return "adminHomePage";
	}
	
	
}
