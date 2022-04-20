package br.com.san.ls.dto;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import br.com.san.ls.entity.User;
import br.com.san.ls.entity.UserLogin;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank
	private String name;

	@NotBlank
	private String lastName;

	@Valid
	private AddressDTO addressDTO;

	@Valid
	private UserLoginDTO userLoginDTO;

	public UserDTO() {
	}

	public UserDTO(String name, String lastName, AddressDTO addressDTO, UserLoginDTO userLoginDTO) {
		this.name = name;
		this.lastName = lastName;
		this.addressDTO = addressDTO;
		this.userLoginDTO = userLoginDTO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public AddressDTO getAddressDTO() {
		return addressDTO;
	}

	public void setAddressDTO(AddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}

	public UserLoginDTO getUserLoginDTO() {
		return userLoginDTO;
	}

	public void setUserLoginDTO(UserLoginDTO userLoginDTO) {
		this.userLoginDTO = userLoginDTO;
	}

	public User toUser() {
		User user = new User();
		user.setName(this.name);
		user.setLastName(this.lastName);
		user.setAddress(addressDTO.toAddress());

		UserLogin userLogin = new UserLogin();
		userLogin.setEmail(userLoginDTO.getVerifyEmail());
		userLogin.setPassword(userLoginDTO.getPassword());
		user.setUserLogin(userLogin);
		return user;
	}

}
