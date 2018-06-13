package com.user.web.mobile.otp;

import java.util.Random;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("Development")
@Configuration
@Component
public class DevOTPConfig implements OTPAuthority {

	@Bean
	public String createAndSendOTP() {
		System.out.println("Development Profile OTP Configuration...");    
		String mobile = "678943";
		int len = 4;
		Random rndm_method = new Random();
		char[] otp = new char[len];
		for (int i = 0; i < len; i++)
		{
			otp[i] = mobile.charAt(rndm_method.nextInt(mobile.length()));
		}
		return otp.toString();
	}

}
