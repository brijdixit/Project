package com.cg.fms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Trainer")
public class Trainer extends Employee {
	
	@NotBlank(message = "Skill can't be null or empty")
	@Size(max = 15, message = "Skill can't be longer than 15 characters")
	@Column(length = 15, name = "Skill")
	private String skill;
	
	@Min(value = 1, message = "Experience can't be less than 1 year" )
	@Column(name = "Experience_Years")
	private int expInYrs;
	
	public Trainer() {
		super();
	}

	public Trainer(int employeeId, String empName, String password, Role role, Program program, String skill,int expInYrs) {
		super(employeeId, empName, password, role, program);
		this.skill = skill;
		this.expInYrs = expInYrs;
	}

	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getExpInYrs() {
		return expInYrs;
	}
	public void setExpInYrs(int expInYrs) {
		this.expInYrs = expInYrs;
	}
}
