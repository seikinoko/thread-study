package com.wurui.work_2;

public class Thread2 extends Thread{
	private  SyncObject obj;
	
	public Thread2(SyncObject obj){
		this.obj = obj;
	}
	
	@Override
	public void run() {
		obj.printString("b", "bb");
	}
}
