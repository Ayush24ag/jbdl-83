package com.geeks.threads;
public class SynchronizationDemo {
public static void main(String[] args) throws InterruptedException {
	Banking bank=new Banking();
	Thread t1=new Thread(bank);
	t1.setName("UPI");
	Thread t2=new Thread(bank);
	t2.setName("Net banking");
	t1.start();t2.start();
	t1.join(); t2.join();
	System.out.println("Balance Amt : "+bank.getBalanceAmt());
}
}
class Banking implements Runnable{
	float balanceAmt=5000;
	public void run() {
		debit(3000);
	}
	private  synchronized void debit(int amt) {
		if(balanceAmt>=amt && balanceAmt>0) {
			System.out.println(Thread.currentThread().getName()+" ready to debit");
			balanceAmt=balanceAmt-amt;
			System.out.println(Thread.currentThread().getName()+" transaction success");
		}
		else {
			System.out.println(Thread.currentThread().getName()+" insufficient funds");

		}
	}
	public float getBalanceAmt() {
		return balanceAmt;
	}
	
}
