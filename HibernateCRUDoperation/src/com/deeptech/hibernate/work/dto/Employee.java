package com.deeptech.hibernate.work.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="emp")
public class Employee 
{
	@Id
	@Column(name="e_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="e_name")
	private String empName;
	@Column(name="e_email")
	private String email;
	@Column(name="e_mobile")
	private String mobile;
	@Column(name="e_age")
	private int age;
	@Column(name="e_salary")
	private double salary;
	@Column(name="e_state")
	private String state;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getempName() {
		return empName;
	}
	public void setempName(String empName) {
		this.empName = empName;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getmobile() {
		return mobile;
	}
	public void setmobile( String mobile) {
		this.mobile=mobile;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary = salary;
	}
	public String getstate() {
		return state;
	}
	public void setstate(String state) {
		this.state = state;
	}

}