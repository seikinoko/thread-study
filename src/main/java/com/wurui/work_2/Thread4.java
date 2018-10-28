package com.wurui.work_2;

public class Thread4 extends Thread{
	private int i = 0;
	@Override
	public void run() {
		while(true){
			i++;
			System.out.println("线程-->" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
