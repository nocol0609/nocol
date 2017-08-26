package com.nocol.pojo;

public class PhoneNumber {
	private String countryCode;
	private String stateCode;
	private String number;

	public PhoneNumber() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhoneNumber(String countryCode, String stateCode, String number) {
		super();
		this.countryCode = countryCode;
		this.stateCode = stateCode;
		this.number = number;
	}

	public PhoneNumber(String string) {
		String[] str = string.split("-");
		countryCode = str[0];
		stateCode = str[1];
		number = str[2];
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "PhoneNumber [countryCode=" + countryCode + ", stateCode=" + stateCode + ", number=" + number + "]";
	}

	public String getAsString() {
		// TODO Auto-generated method stub
		return countryCode + "-" + stateCode + "-" + number;
	}

}
