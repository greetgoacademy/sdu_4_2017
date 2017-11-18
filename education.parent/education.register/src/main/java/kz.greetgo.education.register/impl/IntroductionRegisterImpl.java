package kz.greetgo.education.register.impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.education.controller.model.AuthInfo;
import kz.greetgo.education.controller.model.IntroductionInfo;
import kz.greetgo.education.controller.register.AuthRegister;
import kz.greetgo.education.controller.register.IntroductionRegister;

@Bean
public class IntroductionRegisterImpl implements IntroductionRegister{

  @Override
  public IntroductionInfo getIntroductionInfo() {
    return null;
  }
}
