package com.varxyz.jv300.mod010;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitializeDataSource implements ServletContextListener {
	// 1. 파일 읽기(jdbc.properties)
	// 2. DataSource
	// 3. servletContext.setAttribute("", );
	@Override
    public void contextInitialized(ServletContextEvent event)  { 
		
    }
	
	@Override
    public void contextDestroyed(ServletContextEvent event)  { 
		
    }   
}
