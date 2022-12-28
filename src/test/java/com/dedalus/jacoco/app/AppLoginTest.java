package com.dedalus.jacoco.app;

import org.testng.annotations.Test;
import org.testng.Assert;

public class AppLoginTest 
{
    AppLogin appLogin = new AppLogin();
    
	@Test
    public void login_test1()
    {
        boolean status = appLogin.login("admin", "admin");
		Assert.assertEquals(true, status);
    }
	
	@Test
    public void login_test2()
    {
        boolean status = appLogin.login("admins", "admins");
		Assert.assertEquals(false, status);
    }
}
