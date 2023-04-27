package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import connection.DBConnection;
import model.User;

public class UserDao {
	Session session = null;
	Transaction tx = null;
	List<User> list = null;
	User u = null;
	public void insertUser(User u) {
		session = new DBConnection().getSession();
		tx = session.beginTransaction();
		session.save(u);
		tx.commit();
		session.close();
	}
	public User userLogin(User u) {
		session = new DBConnection().getSession();
		tx = session.beginTransaction();
		Query q = session.createQuery("from User u where u.email=:email and u.password=:password");
		q.setParameter("email", u.getEmail());
		q.setParameter("password", u.getPassword());
		list = q.list();
		u =list.get(0);
		tx.commit();
		session.close();
		return u;
	}
	public List<User> getAllUser(){
		session = new DBConnection().getSession();
		tx = session.beginTransaction();
		Query q = session.createQuery("from User");
		list = new ArrayList<User>();
		list = q.list();
		tx.commit();
		session.close();
		return list;
	}
	public User getUserById(int id) {
		session = new DBConnection().getSession();
		tx = session.beginTransaction();
		Query q = session.createQuery("from User u where id=:id");
		q.setParameter("id", id);
		list = q.list();
		u = list.get(0);
		tx.commit();
		session.close();
		return u;
	}
	public void updateUser(User u) {
		session = new DBConnection().getSession();
		tx = session.beginTransaction();
		session.update(u);
		tx.commit();
		session.close();
	}
	public void deleteUser(User u) {
		session = new DBConnection().getSession();
		tx = session.beginTransaction();
		session.delete(u);
		tx.commit();
		session.close();
	}
}
