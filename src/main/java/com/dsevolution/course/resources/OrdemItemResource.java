package com.dsevolution.course.resources;

import com.dsevolution.course.entities.Category;
import com.dsevolution.course.entities.OrderItem;
import com.dsevolution.course.repositories.OrdemItemRepository;
import com.dsevolution.course.services.CategoryService;
import com.dsevolution.course.services.OrdemItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ordemItens")
public class OrdemItemResource {

    @Autowired
    private OrdemItemService service;

    @GetMapping
    public ResponseEntity<List<OrderItem>> findAll(){
        List<OrderItem> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(value = "/{id}")
    public ResponseEntity<OrderItem> findById(@PathVariable Integer id){
       OrderItem obj = service.findById(id);
       return ResponseEntity.ok().body(obj);
    }

}
