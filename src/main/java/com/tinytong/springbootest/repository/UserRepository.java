package com.tinytong.springbootest.repository;


import com.tinytong.springbootest.enity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String>{


}

