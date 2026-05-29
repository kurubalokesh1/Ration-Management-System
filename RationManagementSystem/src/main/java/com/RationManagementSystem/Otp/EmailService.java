package com.RationManagementSystem.Otp;

import java.util.*;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;
    
    Map<String, Integer> otpStorage = new HashMap<>();
    
    public int generateOtp() {

        // GENERATE OTP
        Random rand = new Random();

        int generatedOtp = rand.nextInt(1000, 9999);

		return generatedOtp;
    	
    }

  
    public String sendOtp(String email) {
    	
    	otpStorage.put(email,generateOtp());
    	//otpStorage = generateOtp();
    	 
        // CREATE MESSAGE
        SimpleMailMessage message = new SimpleMailMessage();

        message.setSubject("🔐 OTP Verification");

        message.setFrom("lokeshkuruba18@gmail.com");

        message.setTo(email);
       
        message.setText(
                "Dear User,\n\n"
              + "Your OTP is : " + otpStorage.get(email)
              + "\n\nDo not share this OTP."
        );

        // SEND MAIL
        
        try {

            mailSender.send(message);

            return "OTP Sent Successfully";

        } catch (Exception e) {

        	 e.printStackTrace();
            return "Failed To Send OTP";
        }  
    }
    
    // VERIFY OTP
    public String verifyOtp(String email,Integer userOtp) {

        if(userOtp == otpStorage.get(email)) {

            return "OTP Verified Successfully";
        }

        return "Invalid OTP";
    }
}