package com.wurui.work_2;

public class Thread3 extends Thread{
	@Override
	public void run() {
		long start = System.currentTimeMillis();
		for(int i=0;i<500000;i++){
//			Thread.yield();
		}
		long end = System.currentTimeMillis();
		
		System.out.println("执行时间:" + (end - start));
	}
}
