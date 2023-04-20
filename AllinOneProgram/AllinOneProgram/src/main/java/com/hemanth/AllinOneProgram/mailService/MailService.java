//package com.hemanth.AllinOneProgram.mailService;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//@Component
//public class MailService
//{
//  @Autowired
//    JavaMailSender javaMailSender;
//
//  public void sendMessage(String msg)
//  {
//      SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
//      simpleMailMessage.setFrom("universitynmamit.nmamit.in");
//      simpleMailMessage.setTo(msg);
//      simpleMailMessage.setSubject("Student Registeration");
//      simpleMailMessage.setText("Student Successfully Registered into the University");
//
//
//      javaMailSender.send(simpleMailMessage);
//  }
//
//}
