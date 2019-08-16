package com.congthang.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "person_id")
	private int personId;
	@Column(name = "account_id")
	private int accountId;
	@Column(name = "address_id")
	private int addressId;
	@Column(name = "name")
	private String name;
	@Column(name = "phone")
	private String phone;
	@Column(name = "type")
	private String type;
	public Person(int personId, int accountId, int addressId, String name, String phone, String type) {
		super();
		this.personId = personId;
		this.accountId = accountId;
		this.addressId = addressId;
		this.name = name;
		this.phone = phone;
		this.type = type;
	}
	public Person() {
		super();
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", accountId=" + accountId + ", addressId=" + addressId + ", name="
				+ name + ", phone=" + phone + ", type=" + type + "]";
	}
	
}
