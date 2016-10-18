package Ennty; /**
 * Created by Саша on 08.10.2016.
 */
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "login")
    public String login;

    @Column(name = "password")
    private String password;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="userproducts",
            joinColumns={@JoinColumn(name="user_id")},
            inverseJoinColumns={@JoinColumn(name="product_id")})
    private Set<Product> products = new HashSet<Product>();



    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public User() {
    }

    public User(String name, String lastName) {

        this.login = name;
        this.password = lastName;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String name) {
        this.login = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String lastName) {
        this.password = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                '}';
    }
}
