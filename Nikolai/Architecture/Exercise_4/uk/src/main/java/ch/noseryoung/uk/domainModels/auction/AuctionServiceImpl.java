package ch.noseryoung.uk.domainModels.auction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuctionServiceImpl implements AuctionService {

private final AuctionRepository auctionRepository;

@Autowired
public  AuctionServiceImpl(AuctionRepository auctionRepository) {
    this.auctionRepository = auctionRepository;
}

    // The logic for creating a new auction
    @Override
    public Auction create(Auction auction) {
        auctionRepository.save(auction);
        return auction;
    }

    // The logic for retrieving all AUCTIONs
    @Override
    public List<Auction> findAll() {
        return auctionRepository.findAll();
    }

    // The logic for retrieving a single auction with a given id
    @Override
    public Auction findById(int id) {
        Auction chosenAuction = new Auction();
        return auctionRepository.findById(id).orElse(null);
}

    // The logic for updating an existing auction with a given id and data
    @Override
    public Auction updateById(int id, Auction auction) {
    auction.setId(id);
        auctionRepository.save(auction);
        return auction;
    }

    // The logic for deleting an auction with a given id
    @Override
    public void deleteById(int id) {
        auctionRepository.deleteById(id);
        System.out.println("The delete method has been called with the id: " + id);
    }

}
