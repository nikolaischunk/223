package ch.noseryoung.uk.domainModels.role;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static ch.noseryoung.uk.domainModels.authority.AuthorityServiceImpl.AUTHORITY_1;
import static ch.noseryoung.uk.domainModels.authority.AuthorityServiceImpl.AUTHORITY_2;

// This is an example service implementation with coded out CRUD logic
// Note that the @Service annotation belongs on here as the effective logic is found here
@Service
public class RoleServiceImpl implements RoleService {

    // Static values for responses
    public static final Role ROLE_1 = new Role().setId(1).setName("Admin").setAuthorities(Set.of(AUTHORITY_2));

    public static final Role ROLE_2 = new Role().setId(2).setName("Apprentice").setAuthorities(Set.of(AUTHORITY_1));

    public static final List<Role> ROLES= Arrays.asList(ROLE_1, ROLE_2);

    // The logic for creating a new role
    @Override
    public Role create(Role role) {
        return role;
    }

    // The logic for retrieving all roles
    @Override
    public List<Role> findAll() {
        return ROLES;
    }

    // The logic for retrieving a single role with a given id
    @Override
    public Role findById(int id) {
        Role chosenRole = new Role();

        for (Role role : ROLES) {
            if (id == role.getId()) {
                chosenRole = role;
            }
        }

        return chosenRole;
    }

    // The logic for updating an existing role with a given id and data
    @Override
    public Role updateById(int id, Role role) {
        role.setName("NewName");
        return role;
    }

    // The logic for deleting a role with a given id
    @Override
    public void deleteById(int id) {
        System.out.println("The delete method has been called with the id: " + id);
    }
}
