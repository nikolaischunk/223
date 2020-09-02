package ch.noser.helloworld.domainModels.product;

import ch.noser.helloworld.domainModels.category.Category;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Generated(GenerationTime.ALWAYS)
    @Column(name = "id")
    private String productId;

    @Column(name = "bezeichnung")
    private String productBez;

    @Column(name = "price")
    private float price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category productCategory;

    public Product(){}

    public Product(String productBez, float price, Category Category) {
        this.productBez = productBez;
        this.price = price;
        this.productCategory = Category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductBez() {
        return productBez;
    }

    public void setProductBez(String productBez) {
        this.productBez = productBez;
    }

    public Category getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Category category) {
        productCategory = category;
    }

}
