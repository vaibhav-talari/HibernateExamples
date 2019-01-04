package com.example.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name="All Books With Price Range",
			query="select b from TestClass b where b.price between :limit1 and :limit2"
			)
	
})

@Entity
@Table(name="test")
public class TestClass {
	
	@Id
	private int bcode;
	private String title;
	private double price;
	public int getBcode() {
		return bcode;
	}
	public void setBcode(int bcode) {
		this.bcode = bcode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "TestClass [bcode=" + bcode + ", title=" + title + ", price=" + price + "]";
	}
	

}
