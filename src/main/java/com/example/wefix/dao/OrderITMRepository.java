package com.example.wefix.dao;

import com.example.wefix.model.OrderHSRequest;
import com.example.wefix.model.OrderITMRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderITMRepository extends JpaRepository<OrderITMRequest,String> {
    public void deleteById(String id);
    public List<OrderITMRequest> findAll();
}
