package com.seed.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="result")
public class Result {
	
	int roll;
	int marks;	
	String sub;
	Student stud;
	
	
	@Column(name="subject",nullable=false)
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	@Id
	@GeneratedValue
	@Column(name="sno")
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	@Column(name="marks",nullable=false)
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="roll")
	public Student getStud() {
		return stud;
	}
	public void setStud(Student stud) {
		this.stud = stud;
	}
	

}
