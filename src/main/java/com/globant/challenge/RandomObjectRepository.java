package com.globant.challenge;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RandomObjectRepository extends MongoRepository<RandomObject, String> {}