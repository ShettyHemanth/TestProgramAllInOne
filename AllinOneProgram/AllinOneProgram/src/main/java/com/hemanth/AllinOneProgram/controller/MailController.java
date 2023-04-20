package com.hemanth.AllinOneProgram.controller;

import com.hemanth.AllinOneProgram.configuration.EmailConfig;
import com.hemanth.AllinOneProgram.model.University;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MailController
{
    @Autowired
    RabbitTemplate rabbitTemplate;
    @RequestMapping(method = RequestMethod.POST,value = "/add/mail")
    public String sendMessage(@RequestBody University l)
    {



        rabbitTemplate.convertAndSend(EmailConfig.topic_exchange,EmailConfig.routing_Key,l);

        return "Data Entered successfully";
    }

}
