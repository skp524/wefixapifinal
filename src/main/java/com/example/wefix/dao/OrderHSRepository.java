package com.example.wefix.dao;
//Shashank Pandey
//10/04/2020

import com.example.wefix.model.OrderHSRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderHSRepository extends JpaRepository<OrderHSRequest,String> {
    public void deleteById(String id);
    public List<OrderHSRequest> findAll();
}
