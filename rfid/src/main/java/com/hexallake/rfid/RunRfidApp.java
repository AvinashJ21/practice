/*
 */
package com.hexallake.rfid;

import com.hexallake.rfid.components.LoginFrame;
import com.hexallake.rfid.entities.Users;
import com.hexallake.rfid.repo.UserRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author avinash
 */
@Component
public class RunRfidApp implements CommandLineRunner {

  @Autowired
  UserRepo usrRepo;

    @Override
    public void run(String... args) throws Exception {
       
//             List<Users>  lst =   usrRepo.findAll();
//             System.out.println("\n\n LIST \n\n"+lst);
             LoginFrame login = new LoginFrame(usrRepo);
             login.setVisible(true);
             login.setLocationRelativeTo(null);
        
    }
    
}
