package cn.hgu.dao;

import java.util.List;

import org.hibernate.HibernateException;

import cn.hgu.model.House;
import cn.hgu.model.HouseCondition;
import cn.hgu.model.PageInfo;

public interface houseDao {
	/*
	 *  房屋注册
	 */
	public void insert_house(House house)throws HibernateException;
	
	/*
	 * 房屋筛选
	 * */
	public List<House> select_house(String price,String street_id,String type_id,String floorage,String title);
	
	/*
	 * 房屋显示*/
	public PageInfo findAll(PageInfo p);
	
}
