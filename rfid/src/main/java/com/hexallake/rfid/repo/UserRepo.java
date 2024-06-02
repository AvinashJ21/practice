/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hexallake.rfid.repo;
import com.hexallake.rfid.entities.Users;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author navin
 */
@Repository
public interface UserRepo  extends JpaRepository<Users, Integer>{
    
       public Optional<Users> findByEmailAndPassword(String email,String password);
}
