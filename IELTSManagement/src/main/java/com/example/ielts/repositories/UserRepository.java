package com.example.ielts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ielts.models.User;

public interface  UserRepository extends JpaRepository<User, String>{

}
