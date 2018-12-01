package cn.hgu.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;

import cn.hgu.dao.BaseDao;
import cn.hgu.dao.UserDao;
import cn.hgu.model.Users;



public class UserDaoImpl extends BaseDao implements UserDao {
    /**
     * 注册
     */
    @Override
    public void insert(Users user) throws HibernateException {
        this.currentSession().save(user);
    }

  /*  *//**
     * 登录
     *//*
    @SuppressWarnings("unchecked")
    @Override
    public List<Users> select(Users user) throws HibernateException {
        return this.currentSession()
                .createQuery("from Users where name=:name and password=:password")
                .setProperties(user).list();
    }
    */
    
    /**
     * 登录
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<Users> select(Users user) throws HibernateException {
        return this.currentSession()
                .createQuery("from Users where name=:name and password=:password")
                .setProperties(user).list();
    }


}
