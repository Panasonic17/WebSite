package Ennty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Саша on 16.10.2016.
 */
@Entity(name = "product")
public class Product implements Serializable {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;

        @Column(name = "description")
        public String description;

        @Column(name = "type")
        private String type;



    public Set<User> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<User> employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != product.id) return false;
        if (description != null ? !description.equals(product.description) : product.description != null) return false;
        if (type != null ? !type.equals(product.type) : product.type != null) return false;
        if (value != null ? !value.equals(product.value) : product.value != null) return false;
        return employees != null ? employees.equals(product.employees) : product.employees == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        //result = 31 * result + (employees != null ? employees.hashCode() : 0);
        return result;
    }

    @Column(name = "value")
    private Double value;

    @ManyToMany(mappedBy="products")
    private Set<User> employees = new HashSet<User>();

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
