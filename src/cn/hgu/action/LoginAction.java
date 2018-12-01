package cn.hgu.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.hgu.model.Users;
import cn.hgu.service.UserService;
import cn.hgu.service.impl.UserServiceImpl;

public class LoginAction extends ActionSupport {
	private String name;
	private String password;
	private UserService service=new UserServiceImpl();
	private Users user=new Users();
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
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("loginaction");
		System.out.println("name++++++"+name);
		user.setName(name);
		user.setPassword(password);
		if(service.login(user)!=null)
			return SUCCESS;
		else 
			return ERROR;
	}
}	
