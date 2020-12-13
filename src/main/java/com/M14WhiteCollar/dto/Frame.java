package com.M14WhiteCollar.dto;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="frames")
public class Frame {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 45, nullable = false)
	private String name;
	
	@Column()
	private String author;
	
	@Column(nullable=false)
	private int price;
	
	@Column(nullable=true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date storeEntryDate;
	
	
	// Constructors
	
	protected Frame() {
	}
	
	public Frame(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Frame(String name, int price, String author) {
		this.name = name;
		this.price = price;
		this.author = author;
	}

	
	// Getters & Setters
	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the storeEntryDate
	 */
	public Date getStoreEntryDate() {
		return storeEntryDate;
	}

	/**
	 * @param storeEntryDate the storeEntryDate to set
	 */
	public void setStoreEntryDate(Date storeEntryDate) {
		this.storeEntryDate = storeEntryDate;
	}
	


	
	
	
}
