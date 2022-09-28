package com.parkingSystem.OnlineParkingSystem.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;
	private String paymentType;
	private String ownerName;
	private String typeOfCard;
	private Date expireDate;
	
	public Payment(int paymentId, String paymentType, String ownerName, String typeOfCard, Date expireDate) {
		super();
		this.paymentId = paymentId;
		this.paymentType = paymentType;
		this.ownerName = ownerName;
		this.typeOfCard = typeOfCard;
		this.expireDate = expireDate;
	}

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getTypeOfCard() {
		return typeOfCard;
	}

	public void setTypeOfCard(String typeOfCard) {
		this.typeOfCard = typeOfCard;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	
	
	
	
}
