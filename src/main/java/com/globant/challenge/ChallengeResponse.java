package com.globant.challenge;

public class ChallengeResponse {
	
	public Integer randomNumber = null;
	public String randomAnimalName = null;
	
	public ChallengeResponse(Integer randomNumber, String randomAnimalName) {
		super();
		this.randomNumber = randomNumber;
		this.randomAnimalName = randomAnimalName;
	}
	public Integer getRandomNumber() {
		return randomNumber;
	}
	public void setRandomNumber(Integer randomNumber) {
		this.randomNumber = randomNumber;
	}
	public String getRandomAnimalName() {
		return randomAnimalName;
	}
	public void setRandomAnimalName(String randomAnimalName) {
		this.randomAnimalName = randomAnimalName;
	}
	
	
}
