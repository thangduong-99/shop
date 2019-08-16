package com.congthang.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "group_product")
public class GroupProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "group_id")
	private int groupId;
	@Column(name = "group_name")
	private int groupName;
	public GroupProduct(int groupId, int groupName) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
	}
	public GroupProduct() {
		super();
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public int getGroupName() {
		return groupName;
	}
	public void setGroupName(int groupName) {
		this.groupName = groupName;
	}
	@Override
	public String toString() {
		return "GroupProduct [groupId=" + groupId + ", groupName=" + groupName + "]";
	}
	
}
