package com.prodapt.prepaid.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prepaid")
public class Prepaid{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String packname;
	int cost;
	String details;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPackname() {
		return packname;
	}
	public void setPackname(String packname) {
		this.packname = packname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Prepaid [id=" + id + ", packname=" + packname + ", cost=" + cost + ", details=" + details + "]";
	}
	public Prepaid(int id, String packname, int cost, String details) {
		super();
		this.id = id;
		this.packname = packname;
		this.cost = cost;
		this.details = details;
	}
	public Prepaid() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}