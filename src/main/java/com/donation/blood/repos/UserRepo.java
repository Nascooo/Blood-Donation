package com.donation.blood.repos;

import com.donation.blood.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User , String> {

    User findByUserName(String userName);
}
