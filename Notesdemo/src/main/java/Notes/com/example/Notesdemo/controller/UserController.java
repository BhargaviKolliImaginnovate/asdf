package Notes.com.example.Notesdemo.controller;

import Notes.com.example.Notesdemo.entity.Users;
import Notes.com.example.Notesdemo.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

@Autowired
    private UserRepository userRepository;


@GetMapping("/Users")
    public List<Users> user(){
 return  userRepository.findAll();
}
}
