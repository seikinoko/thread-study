package com.wurui.work_2;

import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		/*
		Thread1 thread = new Thread1();
		System.out.println("new:alive-" + thread.isAlive());
		thread.start();
		System.out.println("start:alive-" + thread.isAlive());
		try {
			//Thread.sleep(1000);
			TimeUnit.SECONDS.sleep(1);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("finish:alive-" + thread.isAlive());
		*/
		
		/*
		Runnable1 r = new  Runnable1();
		
		for (int i = 0; i < 3; i++) {
			Thread t = new Thread(r);
			t.start();
			System.out.println(t.getId());
		}
		*/
		
		/*
		SyncObject syncObject = new SyncObject();
		Thread2 thread = new Thread2(syncObject);
		thread.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.stop();
		System.out.println(syncObject.getName() + "----" + syncObject.getPassword());
		
		*/
		
		Thread4 t4 = new Thread4();
		t4.setDaemon(true);
		t4.start();
		
		Thread4 t5 = new Thread4();
		t5.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("主线程结束!");
	}
}
