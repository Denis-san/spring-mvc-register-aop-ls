package br.com.san.ls.dto;

import java.io.Serializable;

import br.com.san.ls.entity.Address;

public class AddressDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String city;
	private String state;
	private String addressName;
	private String district;
	private String complement;
	private Integer number;

	public AddressDTO() {
	}

	public AddressDTO(String city, String state, String addressName, String district, String complement,
			Integer number) {
		super();
		this.city = city;
		this.state = state;
		this.addressName = addressName;
		this.district = district;
		this.complement = complement;
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Address toAddress() {
		Address address = new Address();

		address.setCity(this.city);
		address.setAddressName(this.addressName);
		address.setComplement(this.complement);
		address.setDistrict(this.district);
		address.setNumber(this.number);
		address.setState(this.state);

		return address;
	}
}
