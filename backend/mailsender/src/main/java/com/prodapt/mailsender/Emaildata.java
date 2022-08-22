package com.prodapt.mailsender;

public class Emaildata {
	String toEmail;
    int otp;
	public String getToEmail() {
		return toEmail;
	}
	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	@Override
	public String toString() {
		return "Emaildata [toEmail=" + toEmail + ", otp=" + otp + "]";
	}
	public Emaildata(String toEmail, int otp) {
		super();
		this.toEmail = toEmail;
		this.otp = otp;
	}
	public Emaildata() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
