package kz.greetgo.education.register.impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.education.controller.model.AuthInfo;
import kz.greetgo.education.controller.register.AuthRegister;
import kz.greetgo.education.controller.register.SendEmailRegister;
import kz.greetgo.education.register.util.GCommonConstant;
import kz.greetgo.email.Email;
import kz.greetgo.email.EmailSender;
import kz.greetgo.email.EmailSenderController;

@Bean
public class AuthRegisterImpl implements AuthRegister{

  @Override
  public AuthInfo getAutoInfo(String accountName, String password) {
    return null;
  }
}
