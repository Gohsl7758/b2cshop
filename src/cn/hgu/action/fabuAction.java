package cn.hgu.action;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;

import cn.hgu.model.House;
import cn.hgu.model.Street;
import cn.hgu.model.Types;
import cn.hgu.model.Users;
import cn.hgu.service.houseService;
import cn.hgu.service.impl.houseServiceImpl;

public class fabuAction extends ActionSupport {
	houseService house_service = new houseServiceImpl();
	House house = new House();
	private String title;
	private int id;

	public houseService getHouse_service() {
		return house_service;
	}

	public void setHouse_service(houseService house_service) {
		this.house_service = house_service;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getHouseDate() {
		return houseDate;
	}

	public void setHouseDate(String houseDate) {
		this.houseDate = houseDate;
	}

	public String getFloorage() {
		return floorage;
	}

	public void setFloorage(String floorage) {
		this.floorage = floorage;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	private String description;
	private String price;
	private String houseDate;
	private String floorage;
	private String contact;
	private Street street = new Street();
	private Types type = new Types();
	private Users user = new Users();
	private Set<House> houses = new HashSet<House>();

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		// return super.execute();
		// System.out.println("fabuaction");
		System.out.println("fasjkdfopiauo+++" + title);
		/*house.setTitle(title);
		house.setDescription(description);
		house.setContact(contact);
		house.setId(1);
		house_service.register_house(house);*/
		
		return SUCCESS;
	}
}
