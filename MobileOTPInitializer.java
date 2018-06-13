package com.user.web.mobile.otp;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MobileOTPInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	
	@Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { MobileOTPConfiguration.class };
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
    
}
