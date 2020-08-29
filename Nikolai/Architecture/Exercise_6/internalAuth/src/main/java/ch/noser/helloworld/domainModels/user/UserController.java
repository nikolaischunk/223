package ch.noser.helloworld.domainModels.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService Service;

    @Autowired
    public UserController(UserService UserService){
        this.Service = UserService;
    }

    //localhost:8080/users GET
    @GetMapping("")
    public @ResponseBody
    ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(Service.getAll(), HttpStatus.OK);
    }


    //localhost:8080/users/id UPDATE
    @PutMapping("/{id}")
    public @ResponseBody ResponseEntity<String> updateUser (@PathVariable String id, @RequestBody User NewUser) {
        return new ResponseEntity<>(Service.updateUser(id, NewUser), HttpStatus.OK);
    }

    //localhost:8080/users POST
    @PostMapping("")
    public @ResponseBody ResponseEntity<String> create(@RequestBody User NewUser) {
        return new ResponseEntity<>(Service.addUser(NewUser), HttpStatus.CREATED);
    }

    //localhost:8080/users/id GET
    @GetMapping("/{id}")
    public @ResponseBody ResponseEntity<User> getById(@PathVariable String id){
        return new ResponseEntity<>(Service.getUserById(id), HttpStatus.OK);
    }

    //localhost:8080/users/id DELETE
    @DeleteMapping("/{id}")
    public @ResponseBody ResponseEntity<String> deleteUserById (@PathVariable String id){
        return new ResponseEntity<>(Service.deleteUser(id), HttpStatus.OK);
    }
}
