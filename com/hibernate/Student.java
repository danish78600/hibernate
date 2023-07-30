package com.hibernate;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)   //read only we donot want to make changes 
public class Student {
	@Id
	private int id;

@Override
	public String toString() {
		return this.id+""+this.name+""+this.sex;
	}
private String name;
private String sex;
private Certificate certi;
public Certificate getCerti() {
	return certi;
}
public void setCerti(Certificate certi) {
	this.certi = certi;
}
public Student(String name, String sex) {
	super();
	this.name = name;
	this.sex = sex;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public Student(int id, String name, String sex) {
	super();
	this.id = id;
	this.name = name;
	this.sex = sex;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


}
