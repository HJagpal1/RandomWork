package com.qa.jdbc;

import java.util.ArrayList;
//import java.util.List;


public interface  Dao<T> {
	
	public void create(T t);
	
	public ArrayList<T> rendAll();
	
	public void update(T t);
	
	public void delete(int id);
}
