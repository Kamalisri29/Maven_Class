package com.adacitin.pageexecution;

public class Execution extends SearchHotelExecution{

	public static void main(String[] args) throws Exception {
		Execution e=new Execution();
		e.browserlaunch("chrome");
		e.browserMaximize();
		e.loadUrl("https://www.facebook.com/");
	    
		
		
	}
}
