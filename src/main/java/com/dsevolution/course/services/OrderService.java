package com.dsevolution.course.services;

import com.dsevolution.course.entities.Order;
import com.dsevolution.course.entities.User;
import com.dsevolution.course.repositories.OrderRepository;
import com.dsevolution.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Integer id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
