package com.dsevolution.course.resources;

import com.dsevolution.course.entities.Category;
import com.dsevolution.course.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/categories")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = categoryService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Integer id){
       Category obg = categoryService.findById(id);
       return ResponseEntity.ok().body(obg);
    }

}
