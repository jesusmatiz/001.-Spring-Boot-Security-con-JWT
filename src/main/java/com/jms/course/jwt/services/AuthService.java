package com.jms.course.jwt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.jms.course.jwt.dto.JwtResponse;
import com.jms.course.jwt.security.JwtIO;
import com.jms.course.jwt.util.DateUtils;

@Service
public class AuthService {
	
	@Autowired
	private JwtIO jwtIO;
	@Autowired
	private DateUtils dateUtils;
	
	@Value("${jms.jwt.token.expires-in}")
	private int EXPIRES_IN;
	
	public JwtResponse login(String clientId, String clientSecret) {
		
		JwtResponse jwt = JwtResponse.builder()
				.tokenType("bearer")
				.accessToken(jwtIO.generateToken("Hola Mundo desde AuthService"))
				.issuedAt(dateUtils.getDateMillis() + "")
				.clientId(clientId)
				.expiresIn(EXPIRES_IN)
				.build();
		
		return jwt;		
	}

}
