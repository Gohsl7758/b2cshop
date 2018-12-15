package cn.hgu.test;

import java.util.List;

import org.junit.Test;

import cn.hgu.dao.houseDao;
import cn.hgu.dao.listDao;
import cn.hgu.dao.impl.houseDaoImpl;
import cn.hgu.dao.impl.listDaoImpl;
import cn.hgu.model.House;
import cn.hgu.model.PageInfo;
import cn.hgu.model.Street;
import cn.hgu.model.Types;
import cn.hgu.model.Users;
import cn.hgu.service.UserService;
import cn.hgu.service.houseService;
import cn.hgu.service.impl.UserServiceImpl;
import cn.hgu.service.impl.houseServiceImpl;

public class APP {

	// 为了成功添加ｈｏｕｓｅ ｓｔｒｅｅｔ ｔｙｐｅ ｈｏｕｓｅ 都必须先添加好

	private static int i;

	@Test
	public void testmain() {
		System.out.println("testmain");
	}

	@Test
	public void add_user() throws Exception {
		UserService u_s = new UserServiceImpl();
		Users user = new Users();
		for (i = 0; i < 10; i++) {
			user.setName("testUser" + i);
			user.setPassword("123456");
			u_s.register(user);
		}
		System.out.println("user tianjia wanbi");
	}

	@Test
	public void add_house() throws Exception {
		houseService h_s = new houseServiceImpl();
		House house = new House();
		for (i = 0; i < 10; i++) {
			house.setTitle("testHouse" + i);
			house.setFloorage((short) (1 + Math.random() * (100 - 1 + 1)));// 1-100
			house.setPrice((int) (1 + Math.random() * (3000 - 1000 + 1)));// 1000-3000
			house.setContact("liyang" + i);
			h_s.register_house(house);
		}
		System.out.println("house tianjia wanbi");

	}

	@Test
	public void find_user() {

	}

	@Test
	public void find_house() {

	}
	/*
	 * public static void main(String[] args) throws Exception { UserService
	 * u_s=new UserServiceImpl(); Users user=new Users(); for(i=0;i<10;i++){
	 * user.setName("testUser"+i); user.setPassword("123456");
	 * u_s.register(user); } System.out.println("user tianjia wanbi"); }
	 */

	@Test
	public void page() {
		PageInfo p=new PageInfo();
		PageInfo pagelist;
		p.setPageIndex(2);
		listDao dao = new listDaoImpl();
		houseDao housedao = new houseDaoImpl();
		System.out.println("listaction");
		pagelist=housedao.findAll(p);
		List<House> houselist=pagelist.getPageList();
		for(House h:houselist){
			System.out.println("afsdasasd++pagehouse"+h.getTitle());
		}
	}
}
