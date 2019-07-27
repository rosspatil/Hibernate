package com.seed.hibernate;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="stud")
public class Student {

	
	String name;
	int roll;
	Set<Result> result;
	@Column(name="name", nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="roll")
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	@OneToMany(mappedBy="stud",fetch=FetchType.LAZY)
	public Set<Result> getResult() {
		return result;
	}
	public void setResult(Set<Result> result) {
		this.result = result;
	}
	
	
	
	
	
	
	
}
