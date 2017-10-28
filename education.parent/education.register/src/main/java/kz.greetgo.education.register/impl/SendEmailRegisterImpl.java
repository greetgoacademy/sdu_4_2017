package kz.greetgo.education.register.impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.education.controller.register.SendEmailRegister;
import kz.greetgo.education.register.util.GCommonConstant;
import kz.greetgo.email.Email;
import kz.greetgo.email.EmailSender;
import kz.greetgo.email.EmailSenderController;

@Bean
public class SendEmailRegisterImpl implements SendEmailRegister{

  public BeanGetter<EmailSender> emailSender;
  public BeanGetter<EmailSenderController> emailSenderController;


  @Override
  public void toSend() {
    emailSenderController.get().sendAllExistingEmails();
  }

  @Override
  public void prepareEmail() {
    Email email=new Email();
    email.setFrom(GCommonConstant.username);
    email.setTo("ilyas.tukibayev@sdu.edu.kz");
    email.setSubject("Test Email");
    email.setBody("If you get this message skip it");
    emailSender.get().send(email);

  }
}
