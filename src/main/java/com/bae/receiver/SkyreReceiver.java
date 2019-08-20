package com.bae.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.bae.entity.SentInfo;
import com.bae.repository.ConsumerRepository;

@Component
public class SkyreReceiver {
	
    @Autowired
    private ConsumerRepository repo;

    @JmsListener(destination = "AccountQueue", containerFactory = "myFactory")
    public void receiveMessage(SentInfo sentInfo) {
    	System.out.println(sentInfo);
        repo.save(sentInfo);
    }

}
