package ch.noser.helloworld.domainModels.orders;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderKey implements Serializable {

    @Column(name = "user_id")
    private String userId;

    @Column(name = "product_id")
    private String productId;

    public OrderKey(){}

    public OrderKey(String userId, String productId) {
        this.userId = userId;
        this.productId = productId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderKey orderKey = (OrderKey) o;
        return Objects.equals(userId, orderKey.userId) &&
                Objects.equals(productId, orderKey.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, productId);
    }
}
