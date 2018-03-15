package ioc.com.dzm.xml.service.imp;

import java.util.List;

import ioc.com.dzm.xml.dao.UserDao;
import ioc.com.dzm.xml.entity.User;
import ioc.com.dzm.xml.service.UserService;

public class UserServiceImp implements UserService {
	
	private UserDao userDao;

	public boolean insertUser(User user) {
		
		return userDao.insertUser(user);
	}

	public boolean deleteUser(Integer uid) {
		return userDao.deleteUser(uid);
	}

	public boolean updateUser(User user) {
		return userDao.updateUser(user);
	}

	public User selectUser(Integer uid) {
		return userDao.selectUser(uid);
	}

	public List<User> selectAllUser() {
		return userDao.selectAllUser();
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
