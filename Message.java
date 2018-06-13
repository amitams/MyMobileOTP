package com.user.web.mobile.otp;

public class Message {
	 
	Long custid;
    String mobile;
    String status;
    String otp;
    String profile;
    
    public Message(Long custid, String mobile) {
        this.mobile = mobile;
        this.custid = custid;
    }
    
    public Message(String mobile, String otp) {
        this.mobile = mobile;
        this.otp = otp;
    }
 
    public Message(Long custid, String profile, String mobile, String status, String otp) {
    	this.custid = custid;
        this.mobile = mobile;
        this.status = status;
        this.otp = otp;
        this.profile = profile;
    }
 
    public Long getCustid() {
        return custid;
    }
 
    public String getMobile() {
        return mobile;
    }
 
    public String getStatus() {
        return status;
    }
 
    public String getOtp() {
        return otp;
    }
    
    public String getProfile() {
        return profile;
    }
}