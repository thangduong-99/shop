package com.congthang.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart_detail")
public class CartDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cart_detail_id")
	private int cartDetailId;
	@Column(name = "cart_id")
	private int cartId;
	@Column(name = "product_id")
	private int productId;
	public CartDetail(int cartDetailId, int cartId, int productId) {
		super();
		this.cartDetailId = cartDetailId;
		this.cartId = cartId;
		this.productId = productId;
	}
	public CartDetail() {
		super();
	}
	public int getCartDetailId() {
		return cartDetailId;
	}
	public void setCartDetailId(int cartDetailId) {
		this.cartDetailId = cartDetailId;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "CartDetail [cartDetailId=" + cartDetailId + ", cartId=" + cartId + ", productId=" + productId + "]";
	}
	
	
}
