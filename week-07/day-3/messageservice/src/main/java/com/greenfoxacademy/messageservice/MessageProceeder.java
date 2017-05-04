package com.greenfoxacademy.messageservice;

import com.greenfoxacademy.model.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by User on 2017. 05. 04..
 */

@Component
public class MessageProceeder {

    @Autowired
    MessageService messageService;

    public void processMessage(String message, String address) {
        messageService.sendMessage(message, address);
    }

}
