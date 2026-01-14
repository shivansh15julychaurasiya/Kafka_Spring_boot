package com.apache.kafka;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	private KafkaTemplate <String, String> kafkaTemplate;
	
	private static final Logger LOGGER=LoggerFactory.getLogger(KafkaProducer.class);
	
	
	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}

	public void sendMessage(String msg) {
		
		LOGGER.info(String.format("Message Send %s", msg));
		kafkaTemplate.send("alert-message"
				,msg);
	}
	
	

}
