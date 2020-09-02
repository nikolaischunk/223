package ch.noseryoung.uk.domainModels.authority;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;

// This is an example controller with CRUD logic
@RestController
@RequestMapping("/authorities")
public class AuthorityController {

    // Static values for responses
    public static final Authority AUTHORITY_1 = new Authority().setId(1).setName("ADMIN");

    public static final Authority AUTHORITY_2 = new Authority().setId(2).setName("APPRENTICE");

    private static final List<Authority> AUTHORITIES = Arrays.asList(AUTHORITY_1, AUTHORITY_2);

    // This endpoint retrieves all authorities as a list
    @GetMapping({"/", ""})
    public ResponseEntity<List<Authority>> getAll() {
        return new ResponseEntity<>(AUTHORITIES, HttpStatus.OK);
    }

    // This endpoint retrieves a single authority by it's id
    @GetMapping("/{id}")
    public ResponseEntity<Authority> getById(@PathVariable int id) {
        Authority chosenAuthority = new Authority();

        for (Authority authority : AUTHORITIES) {
            if (id == authority.getId()) {
                chosenAuthority = authority;
            }
        }

        return new ResponseEntity<>(chosenAuthority, HttpStatus.OK);
    }

    // This endpoint creates a new authority with the data given, currently this process is being mocked
    @PostMapping({"/", ""})
    public ResponseEntity<Authority> create(@RequestBody Authority authority) {
        return new ResponseEntity<>(authority, HttpStatus.CREATED);
    }

    // This endpoint updates an existing authority with the id and data given, currently this process is being mocked
    @PutMapping("/{id}")
    public ResponseEntity<Authority> updateById(@PathVariable int id, @RequestBody Authority authority) {
        authority.setName("NewName");
        return new ResponseEntity<>(authority, HttpStatus.OK);
    }

    // This endpoint deletes an existing authority with the id given, currently this process is being mocked
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id) {
        System.out.println("The delete method has been called with the id: " + id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
