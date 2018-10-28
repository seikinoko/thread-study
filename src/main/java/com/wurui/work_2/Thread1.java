package com.wurui.work_2;

public class Thread1 extends Thread{
	@Override
	public void run() {
		System.out.println("线程启动====>" + Thread.currentThread().getName());
		dosome();
	}
	
	public synchronized void dosome(){
		System.out.println(Thread.currentThread().getName() + "---->进入方法");
		try {
			Thread.sleep(5*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("执行完毕");
	}
}
