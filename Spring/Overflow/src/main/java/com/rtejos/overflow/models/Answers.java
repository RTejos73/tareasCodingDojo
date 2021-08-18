package com.rtejos.overflow.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="answers")
public class Answers {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAnswers;
	private String answers;
	@Column(updatable=false)
    private Date createdAt;
    private Date updatedAt; 
    @JoinColumn(name="id_questions")
    @ManyToOne
    private Questions questions;

    public Answers() {
    	
    }
    
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }


	public Long getIdAnswers() {
		return idAnswers;
	}


	public void setIdAnswers(Long idAnswers) {
		this.idAnswers = idAnswers;
	}


	public String getAnswers() {
		return answers;
	}


	public void setAnswers(String answers) {
		this.answers = answers;
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


	public Questions getQuestions() {
		return questions;
	}


	public void setQuestions(Questions questions) {
		this.questions = questions;
	}

	

}
