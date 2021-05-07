package eCommerce.dataAccess.concretes;

import java.util.ArrayList;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entitites.concretes.User;

public class HibernateUserDao implements UserDao {
	private static int userId=0;
	ArrayList<User> users;
	
	public HibernateUserDao() {
		super();
		this.users = UserDatabase.getUsers();
	}
	
	@Override
	public void add(User user) {
		user.setId(userId);
		users.add(user);
		HibernateUserDao.userId++;
		System.out.println("Üye kayýt iþlemi baþarýlý");
	}
	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<User> getUsers() {
		return users;
	}
	
	
	
}
