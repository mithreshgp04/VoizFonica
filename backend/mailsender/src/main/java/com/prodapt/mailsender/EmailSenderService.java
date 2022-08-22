package com.prodapt.mailsender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendSimpleEmail(String toEmail,
                                int otp
    ) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("voizfonicatele@gmail.com");
        message.setTo(toEmail);
        message.setText("This is your OTP"+otp);
        message.setSubject("This is your OTP");
        mailSender.send(message);
        System.out.println("Mail Sent succesfully...");


    }
    

    }