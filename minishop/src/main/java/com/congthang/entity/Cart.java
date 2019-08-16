package com.congthang.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cart_id")
	private int cartId;
	@Column(name = "person_id")
	private int personId;
	public Cart(int cartId, int personId) {
		super();
		this.cartId = cartId;
		this.personId = personId;
	}
	public Cart() {
		super();
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", personId=" + personId + "]";
	}
	
	
}
