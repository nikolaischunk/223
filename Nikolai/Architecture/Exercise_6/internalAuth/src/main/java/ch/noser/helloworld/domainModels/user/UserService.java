package ch.noser.helloworld.domainModels.user;

import java.util.List;

public interface UserService {

    //returns all users
    List<User> getAll();

    //returns one user by ID
    User getUserById (String id);

    //posts one user
    String addUser (User NewUser);

    //updates user
    String updateUser (String id, User NewUser);

    //deletes user by ID
    String deleteUser (String id);
}
