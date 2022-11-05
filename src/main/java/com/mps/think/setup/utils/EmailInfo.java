package com.mps.think.setup.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailInfo {

	@Value("${MAIL_SMTP_HOST}")
	private String smtpHost;

	@Value("${MAIL_SMTP_AUTH}")
	private String smtpAuth;

	@Value("${MAIL_AUTH_USER}")
	private String authUser;
	
	@Value("${SMTP_EMAIL}")
	private String smtpEmail;

	@Value("${MAIL_AUTH_PASSWORD}")
	private String authPassword;

	@Value("${SMTP_PORT}")
	private String port;

	public String getSmtpHost() {
		return smtpHost;
	}

	public void setSmtpHost(String smtpHost) {
		this.smtpHost = smtpHost;
	}

	public String getSmtpAuth() {
		return smtpAuth;
	}

	public void setSmtpAuth(String smtpAuth) {
		this.smtpAuth = smtpAuth;
	}

	public String getAuthUser() {
		return authUser;
	}

	public void setAuthUser(String authUser) {
		this.authUser = authUser;
	}

	public String getAuthPassword() {
		return authPassword;
	}

	public void setAuthPassword(String authPassword) {
		this.authPassword = authPassword;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	
	public String getSmtpEmail() {
		return smtpEmail;
	}

	public void setSmtpEmail(String smtpEmail) {
		this.smtpEmail = smtpEmail;
	}

	@Override
	public String toString() {
		return "EmailInfo [smtpHost=" + smtpHost + ", smtpAuth=" + smtpAuth + ", authUser=" + authUser + ", smtpEmail="
				+ smtpEmail + ", authPassword=" + authPassword + ", port=" + port + "]";
	}

}
