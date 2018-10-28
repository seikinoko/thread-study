package com.wurui.work_2;

public class Runnable2 implements Runnable{
	private volatile boolean flag = true;
	@Override
	public void run() {
		while(flag){
			System.out.println(Thread.currentThread().getName() + "-->11111111111");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void setFlag(boolean flag){
		this.flag = flag;
	}
}
