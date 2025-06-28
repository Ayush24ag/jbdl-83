package com.geek;

import java.util.Date;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
	//this method called automatically...
	 @KafkaListener( topics =  {"myMsg"},groupId = "group-id")
	public void consumeMessages(ConsumerRecord<String, String> consumer) {
		//cons
		 String key=consumer.key();
		 String value=consumer.value();
		 long timeStamp=  consumer.timestamp();
		 Date date=new Date(timeStamp);
		 System.out.println(key+"  "+value+" received @ "+date);
	}

}
