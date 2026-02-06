package com.gestaodeusers.projeto.controller;

import com.gestaodeusers.projeto.dto.UserDTO;
import com.gestaodeusers.projeto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> listAll(){
        return userService.listAllUsers();
    }

    @PostMapping
    public void create(@RequestBody UserDTO user){
        userService.createUser(user);
    }

    @PutMapping
    public UserDTO update(@RequestBody UserDTO user){
        return userService.updateUser(user);
    }

    //http://endereco/user/3
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        userService.delete(id);
        return ResponseEntity.ok().build();
    }
}
