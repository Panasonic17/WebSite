package DAO;

import Ennty.Product;
import Ennty.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by Саша on 16.10.2016.
 */
public class ProductDAO {
    public static void addProduct(Product product) throws HibernateException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(product);
        session.getTransaction().commit();
        session.close();
    }

    public static List<Product> getAllProducts(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Product> products;
        products = session.createCriteria(Product.class).list();
        session.getTransaction().commit();
        session.close();
        return products;
    }

    public static Product getProduct(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
      Product p=(Product) session.get(Product.class, id);
        session.getTransaction().commit();
        session.close();
        return p;
    }
}
