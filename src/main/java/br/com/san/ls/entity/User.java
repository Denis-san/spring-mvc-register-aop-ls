package br.com.san.ls.entity;

import java.util.Objects;

public class User {
	
	private Integer id;
	private String name;
	private String lastName;
	
	private Address adress;
	
	private UserLogin userLogin;
	
	public User() {
	}

	public User(Integer id, String name, String lastName, Address adress, UserLogin userLogin) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.adress = adress;
		this.userLogin = userLogin;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	public UserLogin getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, userLogin);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id) && Objects.equals(userLogin, other.userLogin);
	}
	
	
}
