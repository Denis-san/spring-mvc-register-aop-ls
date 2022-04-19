package br.com.san.ls.dto;

import java.io.Serializable;

import br.com.san.ls.entity.UserLogin;

public class UserLoginDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String email;
	private String verifyEmail;
	private String password;
	private String verifyPassword;

	private UserDTO userDTO;
	
	public UserLoginDTO() {
	}
	
	public UserLoginDTO(String email, String verifyEmail, String password, String verifyPassword, UserDTO userDTO) {
		this.email = email;
		this.verifyEmail = verifyEmail;
		this.password = password;
		this.verifyPassword = verifyPassword;
		this.userDTO = userDTO;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVerifyEmail() {
		return verifyEmail;
	}

	public void setVerifyEmail(String verifyEmail) {
		this.verifyEmail = verifyEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
	
	
	public UserLogin toUserLogin() {
		UserLogin userLogin = new UserLogin();
		userLogin.setEmail(this.email);
		userLogin.setPassword(this.password);
		userLogin.setUser(this.userDTO.toUser());
		
		return userLogin;
	}
	
}
