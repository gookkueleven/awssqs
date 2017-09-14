package com.example.demo.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.annotation.JmsListeners;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.Destination;

/**
 * Created by ALIENWARE on 14/9/2560.
 */
@Service
public class AddingService {

    @JmsListener(destination = "KookQueue")
    public void consume(String fromQueueJSON){
        System.out.print(fromQueueJSON);
    }

}
