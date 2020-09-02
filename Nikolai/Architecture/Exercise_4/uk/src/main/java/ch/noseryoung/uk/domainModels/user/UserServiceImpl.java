package ch.noseryoung.uk.domainModels.user;

import ch.noseryoung.uk.domainModels.auction.Auction;
import ch.noseryoung.uk.domainModels.auction.AuctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

// This is an example service implementation with coded out CRUD logic
// Note that the @Service annotation belongs on here as the effective logic is found here
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private AuctionRepository auctionRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, AuctionRepository auctionRepository) {
        this.userRepository = userRepository;
        this.auctionRepository = auctionRepository;
    }

    // The logic for creating a new user
    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    // The logic for retrieving all users
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    // The logic for retrieving a single user with a given id
    @Override
    public User findById(int id) {
        return userRepository.findById(id).get();
    }

    // The logic for updating an existing user with a given id and data
    @Override
    public User updateById(int id, User user) {
        if (userRepository.existsById(id)) {
            user.setId(id);

            user.setAuctions(user.getAuctions().stream().map(auction -> {
                return auctionRepository.findById(auction.getId()).orElse(auction);
            }).collect(Collectors.toList()));
/*
* Setzt Auction
* Holt Auction
* Stream = Liste
* map = Verwandelt einene Wert in einen anderen Wert | input -> output
* auction = 1 wert -> ID
* auctionRepository.findById(auction.getId()).orElse(auction) -> sucht ID, wenn nicht gefunden, gibt den "alten" Wert zurück
* */
            userRepository.save(user);

            return user;
        } else {
            throw new NoSuchElementException("No value present");
        }
    }

    // The logic for deleting a user with a given id
    @Override
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

}
