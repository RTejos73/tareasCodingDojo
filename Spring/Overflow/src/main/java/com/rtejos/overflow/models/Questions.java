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
@Table(name="questions")
public class Questions {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idQuestions;
	private String question;
	@Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "tags_questions", 
        joinColumns = @JoinColumn(name = "questions_id"), 
        inverseJoinColumns = @JoinColumn(name = "tags_id")
    )
    private List<Tags> tags;
    
       
    
	public Questions() {
	
	}

	
	
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    public List<Tags> getTags() {
		return tags;
	}

	public Long getIdQuestions() {
		return idQuestions;
	}

	public void setIdQuestions(Long idQuestions) {
		this.idQuestions = idQuestions;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
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



	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}

	
    
    
    
	
	
}
