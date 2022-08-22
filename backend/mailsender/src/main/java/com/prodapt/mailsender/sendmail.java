package com.prodapt.mailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping("/email")
public class sendmail {
	
	@Autowired
    private EmailSenderService emailsenderService;
	
	
	@GetMapping("/send/{toEmail}/{otp}")   //
    public ResponseEntity<?> updateEmployee(@PathVariable String toEmail,@PathVariable int otp 	){
		
		this.emailsenderService.sendSimpleEmail(toEmail,otp);
        return ResponseEntity.ok("Mail Sent............");
    }

}
