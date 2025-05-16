package com.SpringBoot_base.SpringBoot_base.service.implementation;

import com.SpringBoot_base.SpringBoot_base.entity.Message;
import com.SpringBoot_base.SpringBoot_base.repository.MessageRepositery;
import com.SpringBoot_base.SpringBoot_base.service.IMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService implements IMessage {

    private final MessageRepositery messageRepositery;

    @Autowired
    public MessageService(MessageRepositery messageRepositery) {
        this.messageRepositery = messageRepositery;
    }

//    @Override
//    public Message findById(int id) {
//        return messageRepositery.findById(id);
//    }

    @Override
    public Message save(Message message) {
        return messageRepositery.save(message);
    }
}
