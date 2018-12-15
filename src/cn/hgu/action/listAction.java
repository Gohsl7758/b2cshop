package cn.hgu.action;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.hgu.dao.houseDao;
import cn.hgu.dao.listDao;
import cn.hgu.dao.impl.houseDaoImpl;
import cn.hgu.dao.impl.listDaoImpl;
import cn.hgu.model.House;
import cn.hgu.model.PageInfo;
import cn.hgu.model.Street;
import cn.hgu.model.Types;

public class listAction extends ActionSupport {
	listDao dao=new listDaoImpl();
	PageInfo p;
	houseDao housedao=new houseDaoImpl();
	List<Types> id_name;
	List<Street> street_idname;
	PageInfo houselist;
	public PageInfo getP() {
		return p;
	}





	public void setP(PageInfo p) {
		this.p = p;
	}





	public houseDao getHousedao() {
		return housedao;
	}





	public void setHousedao(houseDao housedao) {
		this.housedao = housedao;
	}





	public PageInfo getHouselist() {
		return houselist;
	}





	public void setHouselist(PageInfo houselist) {
		this.houselist = houselist;
	}





	public List<Street> getStreet_idname() {
		return street_idname;
	}





	public void setStreet_idname(List<Street> street_idname) {
		this.street_idname = street_idname;
	}





	public List<Types> getId_name() {
		return id_name;
	}





	public void setId_name(List<Types> id_name) {
		this.id_name = id_name;
	}





	@Override
	public String execute() throws Exception {
		
		// TODO Auto-generated method stub
		//return super.execute();
		System.out.println("listaction");
		System.out.println("ppppppppppp"+p.getPageIndex());
		id_name=dao.show_select();
		street_idname=dao.show_select_two();
		houselist=housedao.findAll(p);
		return SUCCESS;
	}
}
