package DAO;


import Ennty.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * Created by Саша on 29.09.2016.
 */
public class UserDAO {
    public static void addUser(User user) throws HibernateException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
    //    System.err.println("add");
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }
}
