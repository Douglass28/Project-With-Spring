package com.dsevolution.course.services;

import com.dsevolution.course.entities.Category;
import com.dsevolution.course.entities.OrderItem;
import com.dsevolution.course.repositories.CategoryRepository;
import com.dsevolution.course.repositories.OrdemItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdemItemService {
    @Autowired
    private OrdemItemRepository ordemItemRepository;

    public List<OrderItem> findAll(){
        return ordemItemRepository.findAll();
    }

    public OrderItem findById(Integer id){
        Optional<OrderItem> obj = ordemItemRepository.findById(id);
        return obj.get();
    }
}
