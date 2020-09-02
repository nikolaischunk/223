package ch.noseryoung.uk.domainModels.role;

import ch.noseryoung.uk.domainModels.authority.Authority;

import java.util.Set;

// This is an example class on a domain model could be built
public class Role {

    // Regular attributes
    private int id;

    private String name;

    // Example of a dependency
    private Set<Authority> authorities;

    // Standard empty constructor
    public Role() {
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public Role setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Role setName(String name) {
        this.name = name;
        return this;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public Role setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
        return this;
    }

}
