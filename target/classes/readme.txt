1.如何创建线程
	1. 继承thread
	2. new Runnable
	3. CallAble(多线程获取返回值)
2.如何启动线程
	t.start();
3.如何暂停
4.线程的优先级

synchronized 修饰非静态方法 对象锁
synchronized 修饰静态方法类锁
重点:分清对象锁和类锁
volatile
1.保证线程之间数据的可见性
2.用于停止线程,用作全局开关

常用api:
Thread.currentThread() //获取当前线程
Thread.currentThread().getName() //获取线程的名字