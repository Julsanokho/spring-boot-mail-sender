package com.saraya.springbootmailsender.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saraya.springbootmailsender.entity.UserEntity;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<UserEntity, String> {

    UserEntity findByEmailIdIgnoreCase(String emailId);
}
