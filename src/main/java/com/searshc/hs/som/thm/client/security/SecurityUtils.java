package com.searshc.hs.som.thm.client.security;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sears.telluride.security.client.TokenManager;

public class SecurityUtils {
	Logger logger = LoggerFactory.getLogger(SecurityUtils.class);
	private ObjectMapper objectMapper = new ObjectMapper();

//	@Value("${security.clientid}")
//	private String clientID;

	public String fetchAccessToken() {
		try {
			String response = TokenManager.retrieveAccessToken();
			AccessToken accessToken = objectMapper.readValue(response,
					AccessToken.class);
			logger.info("Response from OAuth server : " + accessToken);
			return accessToken.getAccess_token();
		} catch (IOException e) {
			logger.debug(e.getMessage());
		} catch (GeneralSecurityException e) {
			logger.debug(e.getMessage());
		} catch (Exception e){
			logger.error("Inside SecurityUtils class, added by Romil: ",e);
			e.printStackTrace();
		}
		return null;
	}

	public ObjectMapper getObjectMapper() {
		return objectMapper;
	}

	public void setObjectMapper(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	public String getClientID() {
		return "ciboodle";
	}

//	public void setClientID(String clientID) {
//		this.clientID = clientID;
//	}

}

class AccessToken {

	private String access_token;
	private String token_type;
	private String exp;
	private String iss;
	private Error error;

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getToken_type() {
		return token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getIss() {
		return iss;
	}

	public void setIss(String iss) {
		this.iss = iss;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return String
				.format("AccessToken [access_token=%s, token_type=%s, exp=%s, iss=%s, error=%s]",
						access_token, token_type, exp, iss, error);
	}
}

class Error {
	private String code;
	private String message;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("Error [code=%s, message=%s]", code, message);
	}
}
