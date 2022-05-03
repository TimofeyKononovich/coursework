package com.television.coursework.Controller;

import com.television.coursework.Model.User;
import com.television.coursework.Validator.InputDataValidator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    User user=new User(1, true,"First floor");


    //TODO: Use Hibernate to change the state of user's synchronization
    @GetMapping("/synchronization_control/{userid}/{state}")
   public ResponseEntity<String> EnableSynchronize(@PathVariable Integer userid, @PathVariable Boolean state){
        //Extract user synchro info
        if(state == user.isState()){
            return new ResponseEntity<String>("Can't change new state on previous state with the same params", HttpStatus.BAD_REQUEST);
        }
        String response = "Id: "+userid+", Previous State: "+user.isState()+", New State: "+state+", Location: "+ user.getLocation();
        user.setState(state);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }


    //TODO: Use Hibernate to Get info about users
    @GetMapping("/user")
    public String DisplayAllUsers(){
        return "";
    }

    //TODO: Use Hibernate to Get info about current user
    @GetMapping("/user/{userid}")
    public ResponseEntity<String> DisplayUser(@PathVariable Integer userid){

        String response = "Id: "+userid+", State: "+user.isState()+", Location: "+user.getLocation();
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    //TODO: Use Hibernate to change info about current user
    @GetMapping("/configuration/user/{userid}/{location}")
    public ResponseEntity<String> ChangeLocation(@PathVariable Integer userid, @PathVariable String location){
        if(location == user.getLocation()){
            return new ResponseEntity<String>("Can't change new location on previous location with the same params", HttpStatus.BAD_REQUEST);
        }
        String response = "Id: "+userid+", State: "+user.isState()+", Old location: "+user.getLocation()+", New location: "+ location;
        user.setLocation(location);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @GetMapping("/new_user/{location}")
    public ResponseEntity<String> CreateUser(@PathVariable String location){
        User user=new User(2,true,location);
        String response = "New User created   Id: "+user.getID()+", State: "+user.isState()+", New location: "+ location;
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @GetMapping("/delete_user/{userid}")
    public ResponseEntity<String> DeleteUser(@PathVariable Integer userid){
        //Delete from DB with hibernate
        String response = "User deleted   Id: "+user.getID()+", State: "+user.isState()+", New location: "+ user.getLocation();
        return new ResponseEntity<>(response,HttpStatus.OK);
    }
}
