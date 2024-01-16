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

import com.csye6220.esdproject.model.Reception;
import com.csye6220.esdproject.service.ReceptionService;

@Controller
@RequestMapping("/api")
public class ReceptionController {
	
	@Autowired
	private ReceptionService receptionService;
	
	@GetMapping("/reception")
	public List<Reception> get(){
		return receptionService.get();
	}
	
	@GetMapping("/receptionlist")
	public String getList(ModelMap model){
		List<Reception> reception = receptionService.get();
		
		model.addAttribute("receptionList", reception);
		return "receptionList";
	}
	
	@PostMapping("/add-reception")
	public String save(@RequestParam("firstName") String firstName, 
						@RequestParam("middleName") String middleName,
						@RequestParam("lastName") String lastName,
						@RequestParam("gender") String gender,
						@RequestParam("email") String email,
						@RequestParam("mobileNumber") String mobileNumber,
						@RequestParam("photoID") String photoID,
						@RequestParam("country") String country,
						@RequestParam("userName") String userName,
						@RequestParam("password") String password,
						@RequestParam("dob") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dob)
	{
		Reception receptionObj = new Reception(); 
		receptionObj.setFirstName(firstName);
		receptionObj.setMiddleName(middleName);
		receptionObj.setLastName(lastName);
		receptionObj.setDob(dob);
		receptionObj.setGender(gender);
		receptionObj.setEmail(email);
		receptionObj.setMobileNumber(mobileNumber);
		receptionObj.setUserName(userName);
		receptionObj.setPassword(password);		
		receptionService.save(receptionObj);
		return "redirect:/api/receptionlist";
	}
	
	@GetMapping("/edit-reception/{id}")
	public String update(@PathVariable int id, Model model)
	{
		Reception reception = receptionService.get(id);
		model.addAttribute("reception", reception);
		return "editReceptionForm";
	}
	
	@PostMapping("/saveedit-reception/{id}")
    public String editUserSubmit(@PathVariable int id, @ModelAttribute Reception reception, Model model) {

		reception.setId(id);       
		receptionService.save(reception);
        model.addAttribute("message", "Reception updated successfully");
        return "redirect:/api/receptionlist";
    }
	@GetMapping("/delete-reception/{id}")
	public String delete(@PathVariable int id)
	{
		System.out.println("ID  : " + id);
		receptionService.delete(id);
		return "redirect:/api/receptionlist";
	}
	
	@RequestMapping("/reception-form")
	public String Addreception() {
		return "receptionForm";
	}

}
