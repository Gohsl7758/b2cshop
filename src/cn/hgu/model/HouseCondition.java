package cn.hgu.model;

import java.util.Date;

public class HouseCondition {
    private String title;
    private Integer startPrice;
    private Integer endPrice;
    private Date startPubdate;
    private Date endPubdate;
    private String street;
    private String contract;
    private String price;
    private String type;
    private String floorage;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getContract() {
		return contract;
	}
	public void setContract(String contract) {
		this.contract = contract;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFloorage() {
		return floorage;
	}
	public void setFloorage(String floorage) {
		this.floorage = floorage;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(Integer startPrice) {
		this.startPrice = startPrice;
	}
	public Integer getEndPrice() {
		return endPrice;
	}
	public void setEndPrice(Integer endPrice) {
		this.endPrice = endPrice;
	}
	public Date getStartPubdate() {
		return startPubdate;
	}
	public void setStartPubdate(Date startPubdate) {
		this.startPubdate = startPubdate;
	}
	public Date getEndPubdate() {
		return endPubdate;
	}
	public void setEndPubdate(Date endPubdate) {
		this.endPubdate = endPubdate;
	}
    
}
