import DAO.UserDAO;
import Ennty.User;

/**
 * Created by Саша on 08.10.2016.
 */
public class TestMainHib {
    public static void main(String[] args) {
        User u=new User("newTest","123");
        UserDAO.addUser(u);
    }

}
