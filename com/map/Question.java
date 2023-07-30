package com.map;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
private int id;
private String name;

//@OneToOne
//private Answer answer;

@OneToMany(mappedBy = "question",fetch = FetchType.EAGER,cascade = CascadeType.ALL)  //it will makes the loading eager
private List<Answer> answers; 
public Question() {
	super();
	// TODO Auto-generated constructor stub
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

public List<Answer> getAnswers() {
	return answers;
}

public void setAnswers(List<Answer> answers) {
	this.answers = answers;
}

public Question(int id, String name, List<Answer> answers) {
	super();
	this.id = id;
	this.name = name;
	this.answers = answers;
}


}
