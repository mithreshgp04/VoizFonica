package com.prodapt.MicroServiceLogin.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;

import com.prodapt.MicroServiceLogin.Entity.Login;
import com.prodapt.MicroServiceLogin.Repository.LoginRepository;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {
     @RequestMapping("/Project")
        String display()
        {
            System.out.println("Trying to explore API with SpringBoot");
            return "<marquee><h1>prodaptbatch24</h1></marquee>";

        }

        //create operation
         @Autowired
            private LoginRepository loginRepository;

            // get all employees
            @GetMapping("/getuser")
            public List<Login> getAllLogins(){
                return loginRepository.findAll();
            }
            @PostMapping("/adduser")
            public Login createUser(@RequestBody Login login) {
                return loginRepository.save(login);
            }

            // delete customer 
            @DeleteMapping("/deleteuser/{id}")
            public void deleteUser(@PathVariable("id") int id) {
                   loginRepository.deleteById(id);

            }
            @GetMapping("/updateuser/{uname}")
            public ResponseEntity<List<Login>> customercheck(@PathVariable("username") String username) {
                List<Login> ar = loginRepository.findAll();
                for(Login c: ar) {
                    System.out.println("User records are :"+c);
                    if(c.getUsername()==username) {
                        System.out.println("authorized to change");
                        c.setUsername(username);
                        loginRepository.save(c);
                        System.out.println("After change:"+c);
                        break;
                    }else {
                        System.out.println("You are not authorized to change");
                    }

                }
                return ResponseEntity.ok(ar);

            }

}