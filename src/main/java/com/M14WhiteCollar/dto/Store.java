package com.M14WhiteCollar.dto;

import javax.persistence.*;

@Entity
@Table(name="STORES")
public class Store {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 45, nullable = false, unique = true)
	private String name;
	
	@Column(name="MAX_CAPACITY", nullable=false)
	private int maxCapacity;
	
	// Constructors
	
	protected Store() {
	}
	
	public Store(String name, int maxCapacity) {
		this.name = name;
		this.maxCapacity = maxCapacity;
	}
	
	
	// Getter & Setters
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMaxCapacity() {
		return maxCapacity;
	}
	
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	
}
