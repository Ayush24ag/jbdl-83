package com.geeks.threads;

public class MultipleThreadsEx {
public static void main(String[] args) {
	Thread curThread=Thread.currentThread();
	System.out.println("Current running thread is "+curThread.getName());
	Task1 task=new Task1();
	//NEW
	Thread t=new Thread(task); //work for this thread is to execute run() of Task1 class
	t.start();//RUNNABLE 
	//CAN't Predict
	System.out.println("End of main .....");
}
}
class Task1 implements Runnable{
	public void run() {
		//this method executes automatically once the thread started running
		System.out.println("Another thread started .....");
	}
}