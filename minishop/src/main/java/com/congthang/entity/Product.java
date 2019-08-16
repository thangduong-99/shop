package com.congthang.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private int productId;
	@Column(name = "detail_id")
	private int detailId;
	@Column(name = "group_id")
	private int groupId;
	@Column(name = "amount")
	private int amount;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "image")
	private String image;
	public Product(int productId, int detailId, int groupId, int amount, int quantity, String image) {
		super();
		this.productId = productId;
		this.detailId = detailId;
		this.groupId = groupId;
		this.amount = amount;
		this.quantity = quantity;
		this.image = image;
	}
	public Product() {
		super();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", detailId=" + detailId + ", groupId=" + groupId + ", amount="
				+ amount + ", quantity=" + quantity + ", image=" + image + "]";
	}
	
}
