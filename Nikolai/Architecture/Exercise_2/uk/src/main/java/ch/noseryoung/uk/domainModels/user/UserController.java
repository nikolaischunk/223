package ch.noseryoung.uk.domainModels.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import static ch.noseryoung.uk.domainModels.role.RoleController.ROLE_1;
import static ch.noseryoung.uk.domainModels.role.RoleController.ROLE_2;

// This is an example controller with CRUD logic
@RestController
@RequestMapping("/users")
public class UserController {

    // Static values for responses
    private static final User USER_1 = new User().setId(1)
                                                .setUsername("mark")
                                                .setPassword("ohHiMark")
                                                // TODO, fill in values once the auction entity has been made
                                                // .setAuctions()
                                                .setRoles(Set.of(ROLE_1))
                                                .setEnabled(true)
                                                .setLocked(false);
    private static final User USER_2 = new User().setId(2)
                                                .setUsername("karen")
                                                .setPassword("theTrueManager")
                                                // TODO, fill in values once the auction entity has been made
                                                // .setAuctions()
                                                .setRoles(Set.of(ROLE_2))
                                                .setEnabled(true)
                                                .setLocked(false);

    private static final List<User> USERS = Arrays.asList(USER_1, USER_2);

    // This endpoint retrieves all users as a list
    @GetMapping({"/", ""})
    public ResponseEntity<List<User>> getAll() {
        return new ResponseEntity<>(USERS, HttpStatus.OK);
    }

    // This endpoint retrieves a single user by it's id
    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable int id) {
        User chosenUser = new User();

        for (User user : USERS) {
            if (id == user.getId()) {
                chosenUser = user;
            }
        }

        return new ResponseEntity<>(chosenUser, HttpStatus.OK);
    }

    // This endpoint creates a new user with the data given, currently this process is being mocked
    @PostMapping({"/", ""})
    public ResponseEntity<User> create(@RequestBody User user) {
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    // This endpoint updates an existing user with the id and data given, currently this process is being mocked
    @PutMapping("/{id}")
    public ResponseEntity<User> updateById(@PathVariable int id, @RequestBody User user) {
        user.setUsername("NewName");
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    // This endpoint deletes an existing user with the id given, currently this process is being mocked
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id) {
        System.out.println("The delete method has been called with the id: " + id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
