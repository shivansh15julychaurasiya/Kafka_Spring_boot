package com.apache.kafka;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.apache.payload.User;



@Service
public class JsonKafkaConsumer {
	
	private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaConsumer.class);
	
	
	@KafkaListener(topics="alert-message-json",groupId="dms-consumer-group")
	public void consume(User user) {
		
		LOGGER.info(String.format("Json Message receive---->%s", user.toString()));
	}

}
