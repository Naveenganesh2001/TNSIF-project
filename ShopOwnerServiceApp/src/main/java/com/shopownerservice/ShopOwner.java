package com.shopownerservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class ShopOwner {

	private Integer id;
	private String shopName;
	private String ownerName;
	private Integer phNumber;
	private Integer pwd;

	public ShopOwner() {

	}

	public ShopOwner(Integer id, String shopName, String ownerName, Integer phNumber, Integer pwd) {
		super();
		this.id = id;
		this.shopName = shopName;
		this.ownerName = ownerName;
		this.phNumber = phNumber;
		this.pwd = pwd;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Integer getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(Integer phNumber) {
		this.phNumber = phNumber;
	}

	public Integer getPwd() {
		return pwd;
	}

	public void setPwd(Integer pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "ShopOwner [id=" + id + ", shopName=" + shopName + ", ownerName=" + ownerName + ", phNumber=" + phNumber
				+ ", pwd=" + pwd + "]";
	}

}
