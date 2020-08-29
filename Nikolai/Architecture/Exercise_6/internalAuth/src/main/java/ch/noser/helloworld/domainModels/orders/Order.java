package ch.noser.helloworld.domainModels.orders;

import ch.noser.helloworld.domainModels.product.Product;
import ch.noser.helloworld.domainModels.user.User;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @EmbeddedId
    private OrderKey id;

    @ManyToOne
    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("product_id")
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "amount")
    private int amount;

    public Order(){}

    public Order(User user, Product product, int amount) {
        this.id = new OrderKey(user.getUserId(), product.getProductId());
        this.user = user;
        this.product = product;
        this.amount = amount;
    }

    public OrderKey getId() {
        return id;
    }

    public void setId(OrderKey id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
