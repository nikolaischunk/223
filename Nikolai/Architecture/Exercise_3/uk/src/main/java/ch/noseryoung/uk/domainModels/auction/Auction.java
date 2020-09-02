package ch.noseryoung.uk.domainModels.auction;

public class Auction {

    // Regular attributes
    private int id;

    private String name;

    // Standard empty constructor
    public Auction() {
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public Auction setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Auction setName(String name) {
        this.name = name;
        return this;
    }

}
