package ch.noseryoung.uk.businessObjects.authority;

// This is an example class on a domain model could be built
public class Authority {

    // Regular attributes
    private int id;

    private String name;

    // Standard empty constructor
    public Authority() {}

    // Getters and setters
    public int getId() {
        return id;
    }

    public Authority setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Authority setName(String name) {
        this.name = name;
        return this;
    }

}
