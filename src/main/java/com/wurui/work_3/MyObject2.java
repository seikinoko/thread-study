package com.wurui.work_3;

public class MyObject2 {
	synchronized void doit(){
		int i = 0;
		while(i < 5000000){
			System.out.println(Thread.currentThread().getName() + "执行");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i ++;
			if(i == 10){
				int b = 10/0;
			}
		}
	}
}
