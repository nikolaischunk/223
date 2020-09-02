package ch.noseryoung.uk.domainModels.auction;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Auction {

    // Regular attributes
    @Id
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
