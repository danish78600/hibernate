package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity

public class Answer {
	@Id
private int id;
private String name;

//@OneToOne
//private Question question;

@ManyToOne
private Question question;
public Question getQuestion() {
	return question;
}
public void setQuestion(Question question) {
	this.question = question;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Answer(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Answer() {
	super();
	// TODO Auto-generated constructor stub
}

}
