package com.globant.challenge;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document 
public class RandomObject {
	@Id
	private final int number;
	private final String email;
	private final String animalName;

	public String getAnimalName() {
		return animalName;
	}

	public RandomObject(int number, String email, String animalName ) {
		this.number = number;
		this.email = email;
		this.animalName = animalName;
	}

	public int getNumber() {
		return number;
	}

	public String getEmail() {
		return email;
	}
}
