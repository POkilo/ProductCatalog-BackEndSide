package com.entities;

import java.math.BigDecimal;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Map;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {
	//PRODUCT id(pk) categoryid(fk) name price description discountpercent currentprice

//	private Map<Integer, String> categoryMap;
	public Product() {
//		categoryMap = new LinkedHashMap<Integer, String> ();
//		categoryMap.put(1,"sport");
//		categoryMap.put(2,"kitchen");
//		categoryMap.put(3,"entertainment");
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	private int id;
	

	
	@Column(name="name")
	private String name;
	
	
	@Column(name="price", precision = 8, scale = 2)
	private BigDecimal price;
	
	@Column(name="description")
	private String description;
	
	@Column(name="discount_percent", precision = 4, scale = 2)
	private BigDecimal discountPercent;
	
	@Column(name="current_price", precision = 8, scale = 2)
	private BigDecimal currentPrice;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="category_id")
	private Category category;
	
	
//	public LinkedHashMap<Integer, String> getCategoryMap(){
//		return  (LinkedHashMap<Integer, String>) categoryMap;
//	}
	
	public void setId(int i) {
		this.id = i;
	}
	public int getId() {
		return id;
	}
	

	
	public void setName(String s) {
		this.name = s;
	}
	public String getName() {
		return this.name;
	}
	
	public void setDescription(String s) {
		this.description = s;
	}
	public String getDescription() {
		return this.description;
	}
	
	public void setPrice(BigDecimal d) {
		this.price = d;
	}
	public BigDecimal getPrice() {
		return this.price;
	}
	
	public void setDiscountPercent(BigDecimal d) {
		this.discountPercent = d;
	}
	public BigDecimal getDiscountPercent() {
		return this.discountPercent;
	}
	
	public void setCurrentPrice(BigDecimal d) {
		this.currentPrice = d;
	}
	public BigDecimal getCurrentPrice() {
		return this.currentPrice;
	}
	
	public void setCategory(Category c) {
		this.category = c;
	}
	public Category getCategory() {
		return this.category;
	}
	
}
