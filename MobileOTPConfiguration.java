package com.user.web.mobile.otp;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.user.web.mobile.otp")
public class MobileOTPConfiguration implements WebApplicationInitializer {

	@Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //servletContext.setInitParameter("spring.profiles.active", "Development");
    }
}
