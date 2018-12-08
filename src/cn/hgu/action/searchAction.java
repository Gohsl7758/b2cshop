package cn.hgu.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.hgu.dao.houseDao;
import cn.hgu.dao.impl.houseDaoImpl;
import cn.hgu.model.House;

public class searchAction extends ActionSupport {
	private houseDao dao=new houseDaoImpl();
	private List<House> list;
	private String price;
	private String street_id;
	private String type_id;
	private String floorage;
	private String title;
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType_id() {
		return type_id;
	}

	public void setType_id(String type_id) {
		this.type_id = type_id;
	}

	public String getFloorage() {
		return floorage;
	}

	public void setFloorage(String floorage) {
		this.floorage = floorage;
	}

	public String getStreet_id() {
		return street_id;
	}

	public void setStreet_id(String street_id) {
		this.street_id = street_id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		//return super.execute();
		/*System.out.println("searchaction");
		System.out.println("fafasdfasdfasd+"+price);
		System.out.println("fafasd=+"+street_id);*/
		
		list=dao.select_house(price, street_id, type_id, floorage,title);
		System.out.println(list.get(0).getTitle());
		return SUCCESS;
	}

	public List<House> getList() {
		return list;
	}

	public void setList(List<House> list) {
		this.list = list;
	}
}
