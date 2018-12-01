package cn.hgu.dao;

import java.util.List;

import org.hibernate.HibernateException;

import cn.hgu.model.Users;

public interface UserDao {
	/**
	 * 注册
	 */
    public void insert(Users user) throws HibernateException;
	/**
	 * 登录
	 */
	public List<Users> select(Users user) throws HibernateException;
	

}
