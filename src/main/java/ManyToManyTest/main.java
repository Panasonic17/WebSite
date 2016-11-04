package ManyToManyTest;

import DAO.ProductDAO;
import DAO.UserDAO;
import Ennty.Product;

/**
 * Created by Саша on 18.10.2016.
 */
public class main {
    public static void main(String[] args) {

        Product p=ProductDAO.getProduct(4);
       UserDAO.addProductToUser("root",ProductDAO.getProduct(4));

    }
}
