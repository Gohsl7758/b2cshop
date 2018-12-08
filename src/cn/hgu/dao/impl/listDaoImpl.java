package cn.hgu.dao.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.hgu.dao.HibernateUtil;
import cn.hgu.dao.listDao;
import cn.hgu.model.Street;
import cn.hgu.model.Types;

public class listDaoImpl implements listDao {
	
	
	/*
	 * 	添加一个Ｌｉｓｔ将必要的房屋信息放入并返回　使得前段ｊｓｐ页面可以用标签迭代显示
	 * */
	@Override
	public List<Types> show_select() {
		// TODO Auto-generated method stub
		Transaction tx = null;
		tx = HibernateUtil.currentSession().beginTransaction();
		Session session = HibernateUtil.currentSession();

		Query query = session.createQuery("select types.id,types.name from Types types");
		List<Types> id_name=(List<Types>)(Object)query.list();
		List<Types> result=new LinkedList<Types>();
		
		for (Object o : id_name) {
			Types type=new Types();
			Object []m=(Object[])o;
			System.out.println("ids+++"+m[0]+"name++++++"+m[1]);
			type.setId((Short)m[0]);
			type.setName((String)m[1]);
			result.add(type);
		}
		return result;

	}
	
	/*
	 * 	用迫切左外链接完成类似上一个方法的功能
	 * */
	@Override
	public List<Street> show_select_two() {
		// TODO Auto-generated method stub
		Transaction tx = null;
		tx = HibernateUtil.currentSession().beginTransaction();
		Session session = HibernateUtil.currentSession();

		Query query = session.createQuery("select new cn.hgu.model.Street(id,name) from Street ");
		
		List<Street> id_name =query.list();
		for (Street s:id_name) {
			System.out.println("dddd+++"+s.getId()+"fasd++++"+s.getName());
		}
		return id_name;
		
		
	}

}
