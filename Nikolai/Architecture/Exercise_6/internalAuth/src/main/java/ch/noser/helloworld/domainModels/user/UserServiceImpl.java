package ch.noser.helloworld.domainModels.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repo;

    @Override
    public List<User> getAll() {
        return repo.findAll();
    }

    @Override
    public User getUserById(String id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public String addUser(User NewUser) {
        repo.save(NewUser);
        return "User created!";
    }

    @Override
    public String updateUser(String id, User NewUser) {
        User user = getUserById(id);
        user.setEmail(NewUser.getEmail());
        user.setFirstName(NewUser.getFirstName());
        user.setLastName(NewUser.getLastName());
        return "Updated User with ID " + id + "!";
    }

    @Override
    public String deleteUser(String id) {
        repo.deleteById(id);
        return "Deleted user with id " + id + "!";
    }
}
