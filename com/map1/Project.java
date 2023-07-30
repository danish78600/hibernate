package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
private int id;
private String projectName;
@ManyToMany(mappedBy = "projects")    //mappedby tells that dont worry projects column will handle the all stuff.
private List<Emp>emps;
public Project() {
	super();
	// TODO Auto-generated constructor stub
}
public Project(int id, String projectName, List<Emp> emps) {
	super();
	this.id = id;
	this.projectName = projectName;
	this.emps = emps;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}
public List<Emp> getEmps() {
	return emps;
}
public void setEmps(List<Emp> emps) {
	this.emps = emps;
}
}
