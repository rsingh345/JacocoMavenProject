package com.dedalus.jacoco.app;

public class AppLogin 
{
    public boolean login(String user, String password) {
    	boolean loginStatus = false;
    	if(user.equals("admin") && password.equals("admin")) {
    		loginStatus = true;
    	} else if(!user.equals("admin") && !password.equals("admin")) {
    		loginStatus = false;
    	}
    	return loginStatus;
    }
}
