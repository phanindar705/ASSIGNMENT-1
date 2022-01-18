package net.phani.User.service;


import net.phani.User.model.User;
import net.phani.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private  UserRepository userRepository;

  public  List<User> getallusersdetails(){
      return userRepository.findAll();
  }

  public User getuserdetails(String userid){
      return userRepository.findById(userid).get();

  }

  public User adduserdetails(User user){
      userRepository.save(user);
      return user;
  }

   public void  updateuserdetails(String userId,User user) {
       userRepository.save(user);
      // return user;
       /*
      User existinguser = userRepository.findById(userId).get();
      existinguser.setUsername(user.getUsername());
      existinguser.setFirstname(user.getFirstname());
      existinguser.setLastname(user.getLastname());
      existinguser.setEmailId(user.getEmailId());
      existinguser.setPhonenumber(user.getPhonenumber());
      existinguser.setAddress1(user.getAddress1());
      existinguser.setAddress2(user.getAddress2());
      userRepository.save(existinguser);
      return existinguser;

  } */
   }

  public User deleteuserdetails(String userid){
      User user = userRepository.findById(userid).get();
      userRepository.delete(userRepository.findById(userid).get());
      return user;
  }

}
