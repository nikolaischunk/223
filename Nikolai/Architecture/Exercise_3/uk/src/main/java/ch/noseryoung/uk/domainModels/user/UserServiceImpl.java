package ch.noseryoung.uk.domainModels.user;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static ch.noseryoung.uk.domainModels.auction.AuctionServiceImpl.*;
import static ch.noseryoung.uk.domainModels.role.RoleServiceImpl.ROLE_1;
import static ch.noseryoung.uk.domainModels.role.RoleServiceImpl.ROLE_2;

// This is an example service implementation with coded out CRUD logic
// Note that the @Service annotation belongs on here as the effective logic is found here
@Service
public class UserServiceImpl implements UserService {

    // Static values for responses
    private static final User USER_1 = new User().setId(1)
            .setUsername("mark")
            .setPassword("ohHiMark")
            // TODO, fill in values once the auction entity has been made
            .setAuctions(Set.of(AUCTION_2, AUCTION_1, AUCTION_4))
            .setRoles(Set.of(ROLE_1))
            .setEnabled(true)
            .setLocked(false);

    private static final User USER_2 = new User().setId(2)
            .setUsername("karen")
            .setPassword("theTrueManager")
            // TODO, fill in values once the auction entity has been made
            .setAuctions(Set.of(AUCTION_2, AUCTION_3))
            .setRoles(Set.of(ROLE_2))
            .setEnabled(true)
            .setLocked(false);

    private static final List<User> USERS = Arrays.asList(USER_1, USER_2);

    // The logic for creating a new user
    @Override
    public User create(User user) {
        return user;
    }

    // The logic for retrieving all users
    @Override
    public List<User> findAll() {
        return USERS;
    }

    // The logic for retrieving a single user with a given id
    @Override
    public User findById(int id) {
        User chosenUser = new User();

        for (User user : USERS) {
            if (id == user.getId()) {
                chosenUser = user;
            }
        }

        return chosenUser;
    }

    // The logic for updating an existing user with a given id and data
    @Override
    public User updateById(int id, User user) {
        user.setUsername("NewName");
        return user;
    }

    // The logic for deleting a user with a given id
    @Override
    public void deleteById(int id) {
        System.out.println("The delete method has been called with the id: " + id);
    }
}
