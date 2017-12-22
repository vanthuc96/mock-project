package group3.main;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import group3.model.Group;
import group3.model.User;
import group3.util.HibernateUtil;

public class Appmain {
public static void main(String[] args) {
	User user =new User("USER_001","GROUP_01","THUC","TA","THUC1996");
	Group group=new Group("GROUP_001","Admin");
	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	session.save(user);
	session.save(group);
	session.getTransaction().commit();
	session.close();
	sessionFactory.close();
}
}
