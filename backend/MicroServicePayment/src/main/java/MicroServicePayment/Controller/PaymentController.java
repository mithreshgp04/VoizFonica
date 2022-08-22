package MicroServicePayment.Controller;

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

import MicroServicePayment.Repository.*;
import MicroServicePayment.Entity.*;



@RestController
@CrossOrigin
@RequestMapping("/payment")
public class PaymentController{

	 @RequestMapping("/Project2")
     String display()
     {
         System.out.println("Trying to explore API with SpringBoot");
         return "<marquee><h1>prodaptbatch24</h1></marquee>";

     }
	 
	@Autowired
	private PaymentRepository paymentRepository;
	
	@GetMapping("/getpayment")
	public List<Payment> getAllPayment(){
		return paymentRepository.findAll();
		
	}
	
	@PostMapping("/addpayment")
	public Payment createPayment(@RequestBody Payment payment) {
		return (Payment) paymentRepository.save(payment);
	}
	
	@DeleteMapping("/deletepayment/{id}")
	public void deletePayment(@PathVariable("id") int id) {
		System.out.println("Record Deleted");
		paymentRepository.deleteById(id);
	}
	
}