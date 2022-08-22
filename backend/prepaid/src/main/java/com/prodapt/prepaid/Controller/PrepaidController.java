package com.prodapt.prepaid.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.prepaid.Entity.Prepaid;
import com.prodapt.prepaid.Repository.PrepaidRepository;

@RestController
@CrossOrigin
public class PrepaidController{

	@Autowired
	private PrepaidRepository prepaidRepository;
	
	@GetMapping("/getprepaid")
	public List<Prepaid> getAllPayment(){
		return prepaidRepository.findAll();
		
	}
	
	@PostMapping("/addprepaid")
	public Prepaid createPrepaid(@RequestBody Prepaid payment) {
		return (Prepaid) prepaidRepository.save(payment);
	}
	
	@DeleteMapping("/deleteprepaid/{id}")
	public void deletePayment(@PathVariable("id") int id) {
		System.out.println("Record Deleted");
		prepaidRepository.deleteById(id);
	}
	
}
