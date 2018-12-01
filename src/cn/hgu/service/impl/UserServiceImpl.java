package cn.hgu.service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cn.hgu.dao.HibernateUtil;
import cn.hgu.dao.UserDao;
import cn.hgu.dao.impl.UserDaoImpl;
import cn.hgu.model.Users;
import cn.hgu.service.UserService;




public class UserServiceImpl implements UserService {
	private UserDao userdao = new UserDaoImpl();
	private static Configuration conf;
	private static SessionFactory sf;
	static{
		conf=new Configuration();
		conf.configure();
		sf=conf.buildSessionFactory();
	}

	protected Session openSession(){

		return sf.openSession();
	}

	/**
     * 注册
     */
    @Override
    public void register(Users user) throws Exception {
    	Session session=openSession();;
        Transaction tx = null;
        tx = session.beginTransaction();
        try {
        	session.save(user);
        	//userdao.insert(user);  该方法不行　　ｈｉｂｅｒｎａｔｅｕｔｉｌ也不行
        	
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
            throw e;
        }
    }

    /**
     * 登录
     */
    @Override
    public Users login(Users user) throws Exception {
        Transaction tx = null;
        Users result = null;
        try {
            tx = HibernateUtil.currentSession().beginTransaction();
            List<Users> users = userdao.select(user);
            System.out.println("usersssssssss++"+users);
            if (users != null && users.size() == 1)
                result = users.get(0);
            System.out.println("result++++"+result);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
            throw e;
        }
        return result;
    }
    
    
  /*  *//**
     * 登录
     *//*
    @Override
    public Users login(Users user) throws Exception {
    	Session session=openSession();;
        Transaction tx = null;
        tx = session.beginTransaction();
        Users result = null;
        try {
            
            List<Users> users = userdao.select(user);
        	
    		List<Users> userList=session.createQuery("from Users where name=:name and password=:password")
                    .setProperties(user).list();
    	
            System.out.println("usersssssssss++"+userList);
            if (userList != null && userList.size() == 1)
                result = userList.get(0);
            System.out.println("result++++"+result);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
            throw e;
        }
        return result;
    }*/


}
