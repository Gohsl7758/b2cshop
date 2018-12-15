package cn.hgu.dao.impl;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.hgu.dao.BaseDao;
import cn.hgu.dao.HibernateUtil;
import cn.hgu.dao.houseDao;
import cn.hgu.model.House;
import cn.hgu.model.HouseCondition;
import cn.hgu.model.PageInfo;
import cn.hgu.model.Street;
import cn.hgu.model.Types;


public class houseDaoImpl extends BaseDao implements houseDao{

	@Override
	public void insert_house(House house)throws HibernateException  {
		// TODO Auto-generated method stub
		System.out.println("househousehoue"+house.getTitle());
		 this.currentSession().save(house);
	}

	@Override
	public List<House> select_house(String price, String street_id, String type_id, String floorage,String title) {
		Transaction tx=HibernateUtil.currentSession().beginTransaction();
		Session session=HibernateUtil.currentSession();
		// TODO Auto-generated method stub
		/*System.out.println("housecondition");
		System.out.println("fasdf"+price+street_id+type_id+floorage);*/
		if(price.equals("1"))
			price=" ";
		if(street_id.equals("1"))
			street_id=" ";
		if(type_id.equals("1"))
			type_id=" ";
		if(floorage.equals("1"))
			price=" ";
		if(price.equals("0-100"))
			price="between 0 and 100";
		if(price.equals("100-200"))
			price="between 100 and 200";
		if(price.equals("200-1000000"))
			price="between 200 and 1000000";
		if(floorage.equals("0-40"))
			floorage="between 0 and 40";
		if(floorage.equals("40-500"))
			floorage="between 40 and 500";
		if(floorage.equals("500-1000000"))
			floorage="between 500 and 1000000";
		
		/*Query query=session.createQuery("from House h left outer join fetch h.street s where h.title like '%"+title+"%'");
		List list=query.list();
		Iterator it = list.iterator();
		while(it.hasNext()){
			House h=(House)it.next();
			System.out.println("fasdf house"+h);
			Iterator itt=((List<Street>) h.getStreet()).iterator();
			while(itt.hasNext()){
				Street s=(Street) itt.next();
				System.out.println("fdasdf street"+s);
			}
		}*/
		
		
		Query query=session.createQuery("from House h where h.title like '%"+title+"%' and price "+price+" and floorage "+floorage+" and street_id ="+street_id+" and type_id ="+type_id);
		System.out.println(query);
		List<House> list=query.list();
		/*for(House h:list){
			System.out.println("fasdffasdfasdfsdfsdfhouse+++"+h.getTitle());
		}*/
		System.out.println("fasdfa house");
		//System.out.println(streets);
		return list;
	}

	@Override
	public PageInfo findAll(PageInfo p) {
		// TODO Auto-generated method stub
		Transaction tx=HibernateUtil.currentSession().beginTransaction();
		Session session=HibernateUtil.currentSession();
		Query query=session.createQuery("from House h ");
		p.setCount(query.list().size());
		
		int nowpage=1;
		if(p.getPageIndex()>0){
			nowpage=p.getPageIndex();
		}
		query.setFirstResult((p.getPageIndex()-1)*p.PAGESIZE);
		query.setMaxResults(p.PAGESIZE);
		List<House> list=query.list();
		p.setPageList(list);
		
		return p;
	}

}
