package com.user.web.mobile.otp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OTPCommandController {

	@Autowired
	Environment environment;
	
	@Autowired
	OTPAuthority otpAuthority;

	@GetMapping("/")
	public String welcome() {   
		return "Welcome to Generate Mobile OTP Example.";
	}
	
	@GetMapping("/otp/{mobile}")
	public ResponseEntity<Message> getOOTP(@PathVariable("mobile") String mobile) {  
		
		if (mobile == null) {
			return new ResponseEntity<Message>(HttpStatus.NOT_FOUND);
		}	
		String profile = getActiveProfiles();
		String otp = otpAuthority.createAndSendOTP();
		Message msg = new Message(Long.parseLong(mobile), profile, mobile, "Success", otp);
		System.out.println(profile + " Profile OTP is : " + otp);
		return new ResponseEntity<Message>(msg, HttpStatus.OK);
	}

	public String getActiveProfiles() {
		String profile = null;
		for (final String profileName : environment.getActiveProfiles()) {
			System.out.println("Currently active profile - " + profileName);
			profile = profileName;
		}
		return profile; 
	}

}
