package com.example.wefix.dao;
//Shashank Pandey
//09/04/2020

import com.example.wefix.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface UserRepository extends JpaRepository <User,Integer> {
    public List<User> findById(int id);
    public  User findUserByContactNo(String contactNo);
    public void deleteById(int id);
    public List<User> findAll();
    @Query("SELECT u FROM User u WHERE u.emailId = ?1 and u.password = ?2")
    User validateUser(String emailId, String password);
}
