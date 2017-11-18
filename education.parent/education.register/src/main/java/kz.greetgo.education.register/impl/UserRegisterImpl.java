package kz.greetgo.education.register.impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.education.controller.model.AuthInfo;
import kz.greetgo.education.controller.model.UserInfo;
import kz.greetgo.education.controller.register.AuthRegister;
import kz.greetgo.education.controller.register.UserRegister;

@Bean
public class UserRegisterImpl implements UserRegister{

  @Override
  public UserInfo getUserInfo(String personId) {
    return null;
  }
}
