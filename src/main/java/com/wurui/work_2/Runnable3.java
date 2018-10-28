package com.wurui.work_2;

public class Runnable3 implements Runnable{
	@Override
	public void run() {
		System.out.println("--------run----------");
		try {
			Thread.sleep(20*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("当前睡眠状态:" + Thread.interrupted());
		}
	}
}
