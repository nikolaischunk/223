package ch.noseryoung.uk.domainModels.auction;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AuctionServiceImpl implements AuctionService {
    // Static values for responses
    public static final Auction AUCTION_1 = new Auction().setId(1).setName("Uhr");

    public static final Auction AUCTION_2 = new Auction().setId(2).setName("Buch");

    public static final Auction AUCTION_3 = new Auction().setId(3).setName("Goldkette");

    public static final Auction AUCTION_4 = new Auction().setId(4).setName("Armreif");

    private static final List<Auction> AUCTION = Arrays.asList(AUCTION_1, AUCTION_2, AUCTION_3, AUCTION_4);


    // The logic for creating a new auction
    @Override
    public Auction create(Auction auction) {
        return auction;
    }

    // The logic for retrieving all AUCTIONs
    @Override
    public List<Auction> findAll() {
        return AUCTION;
    }

    // The logic for retrieving a single auction with a given id
    @Override
    public Auction findById(int id) {
        Auction chosenAuction = new Auction();

        for (Auction auction : AUCTION) {
            if (id == auction.getId()) {
                chosenAuction = auction;
            }
        }

        return chosenAuction;
    }

    // The logic for updating an existing auction with a given id and data
    @Override
    public Auction updateById(int id, Auction auction) {
        auction.setName("NewName");
        return auction;
    }

    // The logic for deleting an auction with a given id
    @Override
    public void deleteById(int id) {
        System.out.println("The delete method has been called with the id: " + id);
    }

}
