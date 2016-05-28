package com.jagan.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MovieListener {
	@Autowired//
	@Qualifier("movieFinder")// movieFinder bean created by IOC container using <context:component-scan>
	private MovieFinder finder;

	public void setFinder(MovieFinder finder) {
		this.finder = finder;
	}
	public void searchMovie1(){
		System.out.println("Movies from searchMovie1() are \n Run Raja Run \n Prasthanam \n Journey");
		finder.searchMovie();
	}

}
