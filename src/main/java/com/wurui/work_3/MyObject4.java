package com.wurui.work_3;

public class MyObject4 {
//	private String lock = new String("lock");
	private Object lock = new Object();
	public void m1(){
		synchronized (lock) {
			System.out.println(Thread.currentThread().getName() + "-->进入方法m1");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "-->退出方法m1");
		}
	}
	
	public void m2(){
		System.out.println(Thread.currentThread().getName()  + "------阻塞ing-----");
		synchronized (lock) {
			System.out.println(Thread.currentThread().getName() + "-->进入方法m2");
			System.out.println(Thread.currentThread().getName() + "-->退出方法m2");
		}
	}	
	
}
