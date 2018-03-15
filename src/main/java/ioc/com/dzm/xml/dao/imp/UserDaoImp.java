package ioc.com.dzm.xml.dao.imp;

import java.util.ArrayList;
import java.util.List;

import ioc.com.dzm.xml.dao.UserDao;
import ioc.com.dzm.xml.entity.User;

public class UserDaoImp implements UserDao {

	private User user;
	public boolean insertUser(User user) {
		return true;
	}

	public boolean deleteUser(Integer uid) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean updateUser(User user) {
		return false;
	}

	public User selectUser(Integer uid) {
		
		return user;
	}

	public List<User> selectAllUser() {
		List<User> uList = new ArrayList<User>();
		uList.add(new User(1,"张三","12367"));
		uList.add(new User(2,"张三2","123678"));
		uList.add(new User(3,"张三3","123679"));

		return uList;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

}
