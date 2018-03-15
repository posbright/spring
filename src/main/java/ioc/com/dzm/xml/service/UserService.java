package ioc.com.dzm.xml.service;

import java.util.List;

import ioc.com.dzm.xml.entity.User;

/**
 * 服务层接口
 * @author dzm
 *
 */
public interface UserService {
	/**
	 * 插入一个用户
	 * @param user 要插入的用户
	 * @return 是否成功
	 */
	boolean insertUser(User user);
	/**
	 * 删除指定用户
	 * @param uid 用户编号
	 * @return 是否删除成功
	 */
	boolean deleteUser(Integer uid);
	/**
	 * 修改指定用户信息
	 * @param user 新的用户信息
	 * @return 是否修改成功
	 */
	boolean updateUser(User user);
	/**
	 * 根据用户编号查找指定用户
	 * @param uid 用户编号
	 * @return 查询到的用户
	 */
	User selectUser(Integer uid);
	/**
	 * 查询所有用户信息
	 * @return 所有用户信息列表
	 */
	List<User> selectAllUser();
}
