package com.wurui.work_1;

public class Main {
	public static void main(String[] args) {
		System.out.println("main线程的名字:" +Thread.currentThread().getName());
		/*
		// 实现线程的方法1 extend Thread
		ExtendThread t1 = new ExtendThread();
		t1.start();// 启动线程
		
		// 实现线程方法2 implement Runnable
		Thread t2 = new Thread(new ImpRunnable());
		t2.start();
		
		// lambda写法
		Thread t3 = new Thread(() -> System.out.println("Runnable接口实现"));
		t3.start();
		*/
		NotSafe not =  new NotSafe();
		for(int i=0;i<=2;i++){
			Thread thread = new Thread(not);
			thread.setName("线程-" + i);
			thread.start();
		}
		
		
	}
}
