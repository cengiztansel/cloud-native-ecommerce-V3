package com.quantumshop.userservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.quantumshop.userservice.model.UserEntity;

public interface UserRepository
        extends JpaRepository<UserEntity, Long> {
}
