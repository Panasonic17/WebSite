package DAO;


import Ennty.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Саша on 29.09.2016.
 */
public class UserDAO {
    public static void addUser(User user) throws HibernateException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }
    public static User getUserByLogin(String login) throws HibernateException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<User> c =  session.createSQLQuery("Select * from user where login=\"" + login + "\";").addEntity(User.class).list();
        session.getTransaction().commit();
        session.close();
        if(c.size()==1) {
            return c.get(0);
        }
        return null;
    }
}
/*
 Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.getTransaction().commit();
        System.out.println(c.size());
        if (c.size() > 0) {
            return c.get(0);
        }
        return null;
 */