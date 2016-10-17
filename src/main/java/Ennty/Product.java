package Ennty;

import javax.persistence.*;

/**
 * Created by Саша on 16.10.2016.
 */
@Entity(name = "product")
public class Product {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;

        @Column(name = "description")
        public String description;

        @Column(name = "type")
        private String type;

    @Column(name = "value")
    private Double value;

    public Product(String description, String type, Double value) {
        this.description = description;
        this.type = type;
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Product() {
    }

    public Product(String description, String type) {
        this.description = description;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
