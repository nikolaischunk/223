package ch.noseryoung.uk.domainModels.auction.dto;

public class AuctionDTO {

    private int id;

    private String name;

    //leerer Constructor
    public AuctionDTO() {
    }

    public int getId() {
        return id;
    }


    //Getters & Setter
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public AuctionDTO setName(String name) {
        this.name = name;
        return this;
    }
}
