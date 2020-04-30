package com.example.wefix.dao;

import com.example.wefix.model.OrderHSRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderHSRepository extends JpaRepository<OrderHSRequest,String> {
    public void deleteById(String id);
    public List<OrderHSRequest> findAll();
}
