package com.dsevolution.course.resources;

import com.dsevolution.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1, "douglas", "douglas@gmail.com", "1563-6325", "123456");
        return ResponseEntity.ok().body(u);
    }

}
