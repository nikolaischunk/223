package ch.noseryoung.uk.domainModels.authority;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

// This is an example service implementation with coded out CRUD logic
// Note that the @Service annotation belongs on here as the effective logic is found here
@Service
public class AuthorityServiceImpl implements AuthorityService {

    // Static values for responses
    public static final Authority AUTHORITY_1 = new Authority().setId(1).setName("ADMIN");

    public static final Authority AUTHORITY_2 = new Authority().setId(2).setName("APPRENTICE");

    private static final List<Authority> AUTHORITIES = Arrays.asList(AUTHORITY_1, AUTHORITY_2);


    // The logic for creating a new authority
    @Override
    public Authority create(Authority authority) {
        return authority;
    }

    // The logic for retrieving all authorities
    @Override
    public List<Authority> findAll() {
        return AUTHORITIES;
    }

    // The logic for retrieving a single authority with a given id
    @Override
    public Authority findById(int id) {
        Authority chosenAuthority = new Authority();

        for (Authority authority : AUTHORITIES) {
            if (id == authority.getId()) {
                chosenAuthority = authority;
            }
        }

        return chosenAuthority;
    }

    // The logic for updating an existing authority with a given id and data
    @Override
    public Authority updateById(int id, Authority authority) {
        authority.setName("NewName");
        return authority;
    }

    // The logic for deleting an authority with a given id
    @Override
    public void deleteById(int id) {
        System.out.println("The delete method has been called with the id: " + id);
    }
}
