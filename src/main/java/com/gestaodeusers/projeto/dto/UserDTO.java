package com.gestaodeusers.projeto.dto;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.gestaodeusers.projeto.entity.UserEntity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.BeanUtils;

public class UserDTO {
    private  Long id;
    private String name;
    private  String login;
    private String password;
    private String email;

    //Constructor
    //Entity -> DTO
    public  UserDTO(UserEntity user){
        BeanUtils.copyProperties(user, this);
    }

    //Empty
    public  UserDTO(){

    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
