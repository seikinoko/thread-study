package com.wurui.work_3;

public class MyObject {
	public synchronized void say(){
		System.out.println(Thread.currentThread().getName() + ",进入方法");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ",退出方法");
	}
}
