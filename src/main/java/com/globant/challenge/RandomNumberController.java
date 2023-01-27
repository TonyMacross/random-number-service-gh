package com.globant.challenge;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomNumberController {

    private final Random random = new Random();
    private final RandomObjectRepository randomObjectRepository;
    private final String[] animalNames = {"lion", "tiger", "bear", "monkey", "elephant"};

    @Autowired
    public RandomNumberController(RandomObjectRepository randomNumberRepository) {
        this.randomObjectRepository = randomNumberRepository;
    }

    @GetMapping("/challenge")
    public ResponseEntity<ChallengeResponse> getRandomNumber(@RequestParam("email") String email) {
        int randomNumber = random.nextInt();
        String randomAnimalsName = animalNames[random.nextInt(animalNames.length)];
        randomObjectRepository.save(new RandomObject(randomNumber, email, randomAnimalsName));
        return new ResponseEntity<>(new ChallengeResponse(randomNumber, randomAnimalsName), HttpStatus.OK);
    }
}
