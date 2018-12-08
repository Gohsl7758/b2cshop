package cn.hgu.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cn.hgu.dao.HibernateUtil;
import cn.hgu.dao.houseDao;
import cn.hgu.dao.impl.houseDaoImpl;
import cn.hgu.model.House;
import cn.hgu.service.houseService;

public class houseServiceImpl implements houseService {
	houseDao hdao=new houseDaoImpl();
	/*private static Configuration conf;
	private static SessionFactory sf;
	static{
		conf=new Configuration();
		conf.configure();
		sf=conf.buildSessionFactory();
	}

	protected Session openSession(){

		return sf.openSession();
	}*/

	@Override
	public void register_house(House house) {
		// TODO Auto-generated method stub
		
        Transaction tx = null;
        tx =HibernateUtil.currentSession().beginTransaction();
        try {
        	//System.out.println("wojinlaile zhiqian");
        	hdao.insert_house(house);
        	//session.save(house);
        	//System.out.println("wojinlaile  zhihou");
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
            throw e;
        }
	}	

}
