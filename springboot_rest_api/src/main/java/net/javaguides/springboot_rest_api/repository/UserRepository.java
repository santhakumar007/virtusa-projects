package net.javaguides.springboot_rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot_rest_api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}