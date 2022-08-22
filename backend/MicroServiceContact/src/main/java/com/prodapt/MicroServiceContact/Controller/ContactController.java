package com.prodapt.MicroServiceContact.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.MicroServiceContact.ContactRepository.ContactRepository;
import com.prodapt.MicroServiceContact.Entity.Contactus;



@RestController
@CrossOrigin
@RequestMapping("/contact")
public class ContactController{
	
	 @RequestMapping("/Project1")
     String display()
     {
         System.out.println("Trying to explore API with SpringBoot");
         return "<marquee><h1>prodaptbatch24</h1></marquee>";

     }
	@Autowired
	private ContactRepository contactRepository;
	
	@GetMapping("/getcontact")
	public List<Contactus> getAllContact(){
		return contactRepository.findAll();
		
	}
	
	@PostMapping("/addcontact")
	public Contactus createContactus(@RequestBody Contactus contacts) {
		return (Contactus) contactRepository.save(contacts);
	}
	
	@DeleteMapping("/deletecontact/{id}")
	public void deleteContactus(@PathVariable("id") int id) {
		System.out.println("Record Deleted");
		contactRepository.deleteById(id);
	}
}