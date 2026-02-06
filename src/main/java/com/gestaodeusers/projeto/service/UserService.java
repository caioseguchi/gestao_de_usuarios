package com.gestaodeusers.projeto.service;

import com.gestaodeusers.projeto.dto.UserDTO;
import com.gestaodeusers.projeto.entity.UserEntity;
import com.gestaodeusers.projeto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> listAllUsers(){
        List<UserEntity> user = userRepository.findAll();
        return user.stream().map(UserDTO::new).toList();
    }

    public void createUser(UserDTO user){
        UserEntity userEntity = new UserEntity(user);
        userRepository.save(userEntity);
    }

    public UserDTO updateUser(UserDTO user){
        UserEntity userEntity = new UserEntity(user);
        return new UserDTO(userRepository.save(userEntity));
    }

    public void delete(Long id) {
        UserEntity user = userRepository.findById(id).get();
        userRepository.delete(user);
    }

    public UserDTO readById(Long id){
        return new UserDTO(userRepository.findById(id).get());
    }

}
