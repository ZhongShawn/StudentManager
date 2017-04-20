package service_impl;

import org.junit.Test;

import entity.Users;
import junit.framework.Assert;
import service.UsersDAO;

public class TestUsersDAOImpl {

	@Test
	public void testUsersLogin(){
		Users u=new Users(1,"zhangsan","123456");
		UsersDAO udao=new UsersDaoImpl();
		Assert.assertEquals(true, udao.usersLogin(u));
	}
}
