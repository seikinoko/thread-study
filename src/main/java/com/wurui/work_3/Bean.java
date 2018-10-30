package com.wurui.work_3;

public class Bean {
	private String name = "a";
	private String pwd = "aa";
	
	synchronized public void setValue(String name,String pwd){
		this.name = name;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.pwd = pwd;
	}
	
	synchronized public void getValue(){
		System.out.println(name + "," + pwd);
	}
}
