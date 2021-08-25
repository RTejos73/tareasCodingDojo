package com.rtejos.selfjoin.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employees {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name = "manager_id")
    private Employees manager;
    
    @OneToMany(mappedBy="manager", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Employees> empleados;

    
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    
    public Employees() {
    	
    }
    
    
    
    
    public Employees(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}




	public List<Employees> getMisEmpleados(){
    	return this.empleados;
    }
    
    public Employees obtenerMiGerente() {
    	return this.manager;
    }
    
    
    public List<Employees> getEmpleados() {
		return empleados;
	}


	public void setEmpleados(List<Employees> empleados) {
		this.empleados = empleados;
	}


	
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Employees getManager() {
		return manager;
	}


	public void setManager(Employees manager) {
		this.manager = manager;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}


	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    
	
    
}
