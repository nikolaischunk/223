package ch.noseryoung.uk.domainModels.user;

import ch.noseryoung.uk.domainModels.auction.Auction;
import ch.noseryoung.uk.domainModels.role.Role;

import java.time.LocalDate;
import java.util.Set;

// This is an example class on how a domain model could be built
public class User {

    // Regular attributes
    private int id;

    private String username;

    private String password;

    // Examples of dependencies
    private Set<Role> roles;


    // TODO, create attribute once the auction entity has been made
    private Set<Auction> auctions;

    // Attributes necessary for use in a spring boot environment
    private LocalDate accountExpirationDate;

    private LocalDate credentialsExpirationDate;

    private Boolean locked;

    private Boolean enabled;

    // Standard empty constructor
    public User() {
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public User setRoles(Set<Role> roles) {
        this.roles = roles;
        return this;
    }

    // TODO, create getters and setters once the auction entity has been created
    public Set<Auction> getAuctions() {
        return auctions;
    }

    public User setAuctions(Set<Auction> auctions) {
        this.auctions = auctions;
        return this;
    }

    public LocalDate getAccountExpirationDate() {
        return accountExpirationDate;
    }

    public User setAccountExpirationDate(LocalDate accountExpirationDate) {
        this.accountExpirationDate = accountExpirationDate;
        return this;
    }

    public LocalDate getCredentialsExpirationDate() {
        return credentialsExpirationDate;
    }

    public User setCredentialsExpirationDate(LocalDate credentialsExpirationDate) {
        this.credentialsExpirationDate = credentialsExpirationDate;
        return this;
    }

    public Boolean getLocked() {
        return locked;
    }

    public User setLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public User setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

}
