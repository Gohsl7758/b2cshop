package cn.hgu.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.hgu.dao.UserDao;
import cn.hgu.dao.impl.UserDaoImpl;
import cn.hgu.model.Users;
import cn.hgu.service.UserService;
import cn.hgu.service.impl.UserServiceImpl;

public class signAction extends ActionSupport {
	private String name;
	private String password;
	private String telephone;
	private String username;
	private Users user=new Users();
	private UserService service=new UserServiceImpl();
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("signaction");
		System.out.println("uname+++"+name);
		user.setName(name);
		user.setPassword(password);
		user.setTelephone(telephone);
		user.setUsername(username);
		System.out.println("fasdfasdf");
		service.register(user);
		return SUCCESS;
	}	
}
