package com.user.web.mobile.otp;

import java.util.Random;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("Production")
@Configuration
@Component
public class ProdOTPConfig implements OTPAuthority {

	
	@Bean
	public String createAndSendOTP() {
		System.out.println("Production Profile OTP Configuration...");    
		String prefix = "678943";
		int len = 4;
		Random rndm_method = new Random();
		char[] otp = new char[len];
		for (int i = 0; i < len; i++)
		{
			otp[i] = prefix.charAt(rndm_method.nextInt(prefix.length()));
		}
		return otp.toString();
	}
	
}
