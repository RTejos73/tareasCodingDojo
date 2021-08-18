package com.rtejos.overflow.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="tags")
public class Tags {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTags;
	private String subject;
	@Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "tags_questions", 
                joinColumns = @JoinColumn(name = "tags_id"), 
                inverseJoinColumns = @JoinColumn(name = "questions_id")
    )
    private List<Questions> questions;
    
    
    
    
    public Tags() {   	
    	
    }
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

    public List<Questions> getQuestions() {
		return questions;
	}

	public Long getIdTags() {
		return idTags;
	}

	public void setIdTags(Long idTags) {
		this.idTags = idTags;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
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

	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}
    
    
    

}
