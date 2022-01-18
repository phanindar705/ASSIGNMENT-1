package net.phani.User.controller;



import net.phani.User.model.User;
import net.phani.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Usercontroller {

    @Autowired
    private UserService userService;


  // build API to get allusersdetails

    @GetMapping("/users")
    public List<User>getallusers(){
        return  this.userService.getallusersdetails();
    }


  // build API to get specific userdetails

    @GetMapping("/users/{userId}")
    public User getuser(@PathVariable String userId){
        return  this.userService.getuserdetails(userId);
    }


  // build API to create/add user

   @PostMapping("/users")
   public User adduser(@RequestBody User user){
        return this.userService.adduserdetails(user);
   }


   // build API to update userdetails

   @PutMapping("/users/{userId}")
   public void updateuser(@RequestBody User user,@PathVariable String userId){
      userService.updateuserdetails(userId,user);
       // userService.deleteuserdetails(userId);
        // return this.userService.adduserdetails(user);
   }

   // build API to delete userdetails

  @DeleteMapping("users/{userId}")
  public User deleteuser(@PathVariable String userId){
        return this.userService.deleteuserdetails(userId);
  }
}
