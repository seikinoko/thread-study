package com.wurui.work_3;

public class Main {
	public static void main(String[] args) {
		/*
		final MyObject obj = new MyObject();
		Thread t1 = new Thread(() ->obj.say());
		Thread t2 = new Thread(() ->obj.say());
		t1.start();
		t2.start();
		*/
		
		/*
		final Bean bean = new Bean();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				bean.setValue("b", "bb");
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				bean.getValue();
			}
		});
		
		t1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		
		*/
		
		/*
		final MyObject2 obj = new MyObject2();
		Thread t1 = new Thread(() ->obj.doit());
		Thread t2 = new Thread(() ->obj.doit());
		t1.start();
		t2.start();
		*/
		/*
		final MyObject3 obj = new MyObject3();
		Thread t1 = new Thread(() ->obj.m1());
		Thread t2 = new Thread(() ->obj.m2());
		t1.start();
		t2.start();
		*/
		
		/*
		final MyObject4 obj = new MyObject4();
		Thread t1 = new Thread(() ->obj.m1());
		Thread t2 = new Thread(() ->obj.m2());
		t1.start();
		t2.start();
		*/
		
		final MyObject5ClassLock obj1 = new MyObject5ClassLock();
		final MyObject5ClassLock obj2 = new MyObject5ClassLock();
		final MyObject5ClassLock obj3 = new MyObject5ClassLock();
		Thread t1 = new Thread(() ->obj1.m1());
		Thread t2 = new Thread(() ->obj2.m1());
		Thread t3 = new Thread(() ->obj3.m1());
		t1.start();
		t2.start();	
		t3.start();
	}
}
