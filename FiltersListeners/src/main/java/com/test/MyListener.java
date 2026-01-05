package com.test;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class MyListener implements HttpSessionListener {

	
	static ServletContext ctx = null;
	static int total,current = 0;
	
    public void sessionCreated(HttpSessionEvent se)  { 
    	total++;
    	current++;
    	
    	ctx= se.getSession().getServletContext();
    	ctx.setAttribute("tUsers",total);
    	ctx.setAttribute("cUsers",current);
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
       current--;
       ctx.setAttribute("cUsers",current);
    }
	
}
