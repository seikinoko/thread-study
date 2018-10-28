package com.wurui.work_2;

public class Runnable1 implements Runnable {
	@Override
	public void run() {
		System.out.println("线程启动====>" + Thread.currentThread().getName());
		dosome();
	}
	
	public synchronized void dosome(){
		System.out.println(Thread.currentThread().getName() + "---->进入方法");
		try {
			System.out.println(Thread.currentThread().getName() + "---->进入睡眠,不释放锁");
			Thread.sleep(5*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("执行完毕");
	}
}
