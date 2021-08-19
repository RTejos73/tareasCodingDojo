package com.rtejos.consultasyjoins.models;



import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="languages")
public class Language {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String country_code;
	@Enumerated(EnumType.STRING)
	private lenguage type;
	private String is_oficial;
	private double percetage;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="country_id")
	private Countrie countrie ;
	
	
	public Language() {
		
	}


	public enum lenguage{
		T,
		F
	}
	
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCountry_code() {
		return country_code;
	}


	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getIs_oficial() {
		return is_oficial;
	}


	public void setIs_oficial(String is_oficial) {
		this.is_oficial = is_oficial;
	}


	public double getPercetage() {
		return percetage;
	}


	public void setPercetage(double percetage) {
		this.percetage = percetage;
	}


	public lenguage getType() {
		return type;
	}


	public void setType(lenguage type) {
		this.type = type;
	}


	public Countrie getCountrie() {
		return countrie;
	}


	public void setCountrie(Countrie countrie) {
		this.countrie = countrie;
	}


	
	
	
	
}
