package br.com.san.ls.dto;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import br.com.san.ls.entity.UserLogin;
import br.com.san.ls.validation.FieldsMatch;

@FieldsMatch.Fields({
		@FieldsMatch(field = "email", fieldVerify = "verifyEmail", message = "Os emails não correspondem!"),
		@FieldsMatch(field = "password", fieldVerify = "verifyPassword", message = "As senhas não correspondem!") })
public class UserLoginDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank
	@Email
	private String email;
	@NotBlank
	@Email
	private String verifyEmail;
	@NotBlank
	@Length(min = 8, message = "Deve conter no mínimo 8 caracteres")
	private String password;
	@NotBlank
	@Length(min = 8, message = "Deve conter no mínimo 8 caracteres")
	private String verifyPassword;

	@Valid
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
