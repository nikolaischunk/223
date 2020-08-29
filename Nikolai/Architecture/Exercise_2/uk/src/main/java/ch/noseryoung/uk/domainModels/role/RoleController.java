package ch.noseryoung.uk.domainModels.role;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import static ch.noseryoung.uk.domainModels.authority.AuthorityController.AUTHORITY_1;
import static ch.noseryoung.uk.domainModels.authority.AuthorityController.AUTHORITY_2;

// This is an example controller with CRUD logic
@RestController
@RequestMapping("/roles")
public class RoleController {

    // Static values for responses
    public static final Role ROLE_1 = new Role().setId(1).setName("Admin").setAuthorities(Set.of(AUTHORITY_2));

    public static final Role ROLE_2 = new Role().setId(2).setName("Apprentice").setAuthorities(Set.of(AUTHORITY_1));

    public static final List<Role> ROLES= Arrays.asList(ROLE_1, ROLE_2);

    // This endpoint retrieves all roles as a list
    @GetMapping({"/", ""})
    public ResponseEntity<List<Role>> getAll() {
        return new ResponseEntity<>(ROLES, HttpStatus.OK);
    }

    // This endpoint retrieves a single role by it's id
    @GetMapping("/{id}")
    public ResponseEntity<Role> getById(@PathVariable int id) {
        Role chosenRole = new Role();

        for (Role role : ROLES) {
            if (id == role.getId()) {
                chosenRole = role;
            }
        }

        return new ResponseEntity<>(chosenRole, HttpStatus.OK);
    }

    // This endpoint creates a new role with the data given, currently this process is being mocked
    @PostMapping({"/", ""})
    public ResponseEntity<Role> create(@RequestBody Role role) {
        return new ResponseEntity<>(role, HttpStatus.CREATED);
    }

    // This endpoint updates an existing role with the id and data given, currently this process is being mocked
    @PutMapping("/{id}")
    public ResponseEntity<Role> updateById(@PathVariable int id, @RequestBody Role role) {
        role.setName("NewName");
        return new ResponseEntity<>(role, HttpStatus.OK);
    }

    // This endpoint deletes an existing role with the id given, currently this process is being mocked
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id) {
        System.out.println("The delete method has been called with the id: " + id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
