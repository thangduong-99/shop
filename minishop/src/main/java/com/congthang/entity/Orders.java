package com.congthang.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private int orderId;
	@Column(name = "cart_detail_id")
	private int cartDetailId;
	@Column(name = "date")
	private Date date;
	@Column(name = "money")
	private int money;
	@Column(name = "payment")
	private String payment;
	public Orders(int orderId, int cartDetailId, Date date, int money, String payment) {
		super();
		this.orderId = orderId;
		this.cartDetailId = cartDetailId;
		this.date = date;
		this.money = money;
		this.payment = payment;
	}
	public Orders() {
		super();
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCartDetailId() {
		return cartDetailId;
	}
	public void setCartDetailId(int cartDetailId) {
		this.cartDetailId = cartDetailId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", cartDetailId=" + cartDetailId + ", date=" + date + ", money=" + money
				+ ", payment=" + payment + "]";
	}
	
}
