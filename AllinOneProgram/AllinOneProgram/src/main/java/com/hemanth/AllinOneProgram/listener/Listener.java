//package com.hemanth.AllinOneProgram.listener;
//
//import com.hemanth.AllinOneProgram.configuration.EmailConfig;
//import com.hemanth.AllinOneProgram.mailService.MailService;
//import com.hemanth.AllinOneProgram.model.Registeration;
//import com.hemanth.AllinOneProgram.model.University;
//import com.hemanth.AllinOneProgram.repository.RegistrationRepository;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Listener
//{
//
//    @Autowired
//    RegistrationRepository registrationRepository;
//
//
//
//    @Autowired
//    MailService mailService;
//
//
//    @RabbitListener(queues = EmailConfig.login_queue)
//    public void sendingMessage(University university)
//    {
//        String result=university.getStudent().getEmail();
//        System.out.println(result);
//
//        mailService.sendMessage(result);
//
//        System.out.println("Mail sent to --> "+result);
//        System.out.println("Data Inserted Into The DataBase");
//
//        String name=university.getStudent().getName();
//        String y= String.valueOf(university.getYear());
//
//        Registeration rd=new Registeration(name,y,result);
//        registrationRepository.save(rd);
//
//
//
//    }
//}
