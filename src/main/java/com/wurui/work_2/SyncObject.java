package com.wurui.work_2;

public class SyncObject {
	private String name = "a";
	private String password = "aa";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public synchronized void printString(String name,String password){
		try {
			this.name = name;
			Thread.sleep(20000);
			this.password = password;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
