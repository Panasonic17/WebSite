package Ennty; /**
 * Created by Саша on 08.10.2016.
 */
import javax.persistence.*;

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


}
