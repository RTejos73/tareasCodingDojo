package com.rtejos.consultasyjoins.models;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="countries")
public class Countrie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
	private String name;
	@Enumerated(EnumType.STRING)
	private continent type;
	private String region;
	private double surface_area;
	private int indep_year;
	private int population;
	private double life_expectancy;
	private double gpn;
	private double gnp_old;
	private String local_name;
	private String government_form;
	private String head_of_state;
	private int capital;
	private String code2;
	@OneToMany(mappedBy="countrie", fetch = FetchType.LAZY)
	private List<Citie> cities;
	@OneToMany(mappedBy="countrie", fetch = FetchType.LAZY)
	private List<Language> languages;
	
	public Countrie() {
		
	}
	
	public enum continent{
		Asia,
		Europe,
		North_America,
		Africa,
		Oceania,
		Antarctica,
		South_America		
	}


	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public double getSurface_area() {
		return surface_area;
	}

	public void setSurface_area(double surface_area) {
		this.surface_area = surface_area;
	}

	public int getIndep_year() {
		return indep_year;
	}

	public void setIndep_year(int indep_year) {
		this.indep_year = indep_year;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public double getLife_expectancy() {
		return life_expectancy;
	}

	public void setLife_expectancy(double life_expectancy) {
		this.life_expectancy = life_expectancy;
	}

	public double getGpn() {
		return gpn;
	}

	public void setGpn(double gpn) {
		this.gpn = gpn;
	}

	public double getGnp_old() {
		return gnp_old;
	}

	public void setGnp_old(double gnp_old) {
		this.gnp_old = gnp_old;
	}

	public String getLocal_name() {
		return local_name;
	}

	public void setLocal_name(String local_name) {
		this.local_name = local_name;
	}

	public String getGovernment_form() {
		return government_form;
	}

	public void setGovernment_form(String government_form) {
		this.government_form = government_form;
	}

	public String getHead_of_state() {
		return head_of_state;
	}

	public void setHead_of_state(String head_of_state) {
		this.head_of_state = head_of_state;
	}

	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	public continent getType() {
		return type;
	}

	public void setType(continent type) {
		this.type = type;
	}

	

	public List<Citie> getCities() {
		return cities;
	}

	public void setCities(List<Citie> cities) {
		this.cities = cities;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	
	
	
	
}
