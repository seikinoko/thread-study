package com.wurui.work_1;

public class NotSafe implements Runnable {
	private volatile int a = 0;
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			add();
		}
	}
	
	public synchronized void add(){
		a++;
		System.out.println(Thread.currentThread().getName() + ",a:" + a);
	}
}
