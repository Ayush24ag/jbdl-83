package com.geeks.oops2;
public class AbstractclassDemo1 {
public static void main(String[] args) {
	//new Message();
	//Adharsh code
	SMS sms=new SMS();
	receiveNotifications(sms);
	System.out.println("------");
	//Alka code
	WhatsApp wh=new WhatsApp();
	receiveNotifications(wh);
}

//made by ME
static void receiveNotifications(Message m) {
	m.info();
	if(m instanceof WhatsApp ) {
		WhatsApp w=(WhatsApp)m;
		w.getDp();
	}
}
}
