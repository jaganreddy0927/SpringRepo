package com.sathya.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyBean implements BeanNameAware,ApplicationContextAware,InitializingBean,DisposableBean {

	private String msg;
	public MyBean(){
		System.out.println("Contructor called");
	}
	
	
	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("Dependency injected");
	}


	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy Method called");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() method called");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("setApplicationContext() Method called");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("setBeanName() Method Called");
		
	}
	public void setUp(){
		System.out.println("Custom Init() Method called");
		
	}
	public void tearUp(){
		System.out.println("Custom Destroy() Method Called");
		
	}
	public void method1(){
		System.out.println("Method1() Called");
		
	}

}
