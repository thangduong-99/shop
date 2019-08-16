package com.congthang.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detail")
public class Detail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "detail_id")
	private int detailId;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "price")
	private int price;
	@Column(name = "purchase_price")
	private int purchasePrice;
	@Column(name = "description")
	private String desciption;
	public Detail(int detailId, String productName, int price, int purchasePrice, String desciption) {
		super();
		this.detailId = detailId;
		this.productName = productName;
		this.price = price;
		this.purchasePrice = purchasePrice;
		this.desciption = desciption;
	}
	public Detail() {
		super();
	}
	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	@Override
	public String toString() {
		return "Detail [detailId=" + detailId + ", productName=" + productName + ", price=" + price + ", purchasePrice="
				+ purchasePrice + ", desciption=" + desciption + "]";
	}
	
}
