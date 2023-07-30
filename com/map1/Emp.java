package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Emp {
	@Id
private int id;
private String empName;
@ManyToMany
private List<Project>projects;
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp(int id, String empName, List<Project> projects) {
	super();
	this.id = id;
	this.empName = empName;
	this.projects = projects;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public List<Project> getProjects() {
	return projects;
}
public void setProjects(List<Project> projects) {
	this.projects = projects;
}
}
