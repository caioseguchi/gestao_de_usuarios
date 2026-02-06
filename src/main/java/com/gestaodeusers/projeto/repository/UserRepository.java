package com.gestaodeusers.projeto.repository;

import com.gestaodeusers.projeto.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
