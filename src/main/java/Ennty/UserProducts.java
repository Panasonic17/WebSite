package Ennty;

import javax.persistence.*;

/**
 * Created by Саша on 18.10.2016.
 */
@Entity(name = "userproduct")
public class UserProducts {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    public  int userId;
    public int productId;


}
