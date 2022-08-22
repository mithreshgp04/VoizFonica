package com.prodapt.Registration.Controller;

//import java.io.UnsupportedEncodingException;
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import org.aspectj.apache.bcel.classfile.Utility;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.query.Param;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//import com.prodapt.Registration.Entity.Registration;
//import com.prodapt.Registration.Repository.RegistrationRepository;
//
//
//import net.bytebuddy.utility.RandomString;
//
//@RestController
//@CrossOrigin
//@RequestMapping("registration")
//public class RegistrationController {
//    
//    @Autowired
//    private RegistrationRepository registrationRepository;
//    // delete operation
//
//
//
//   @DeleteMapping("/deleteregistration/{id}")
//    public void deleteRegistration(@PathVariable("id") int id) {
//	   registrationRepository.deleteById(id);
//    }
//    // create employee rest api
//    @PostMapping("/addregistration")
//    public Registration createRegistration(@RequestBody Registration user) {
//        return registrationRepository.save(user);
//    }
//    // get all employees
//    @GetMapping("/getregistration")
//    public List<Registration> getAllRegistration() {
//        return registrationRepository.findAll();
//    }
//
//
//
//}

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

import com.prodapt.Registration.Entity.Registration;
import com.prodapt.Registration.Repository.RegistrationRepository;


@RestController
@CrossOrigin
@RequestMapping("reg")
public class RegistrationController{
    @Autowired
    private RegistrationRepository registrationRepository;
    // delete operation

    @DeleteMapping("/deleteregistration/{id}")
    public void deleteRegisteration(@PathVariable("id") int id) {
        registrationRepository.deleteById(id);
    }
    // create employee rest api
    @PostMapping("/addregistration")
    public Registration createRegister(@RequestBody Registration user) {
        return registrationRepository.save(user);
    }
    // get all employees
    @GetMapping("/getregistration")
    public List<Registration> getAllRegister() {
        return registrationRepository.findAll();
    }

}