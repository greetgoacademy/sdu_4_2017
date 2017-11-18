package kz.greetgo.education.register.impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.education.controller.model.AuthInfo;
import kz.greetgo.education.controller.model.DictionaryListDetails;
import kz.greetgo.education.controller.register.AuthRegister;
import kz.greetgo.education.controller.register.DictionaryRegister;

@Bean
public class DictionaryRegisterImpl implements DictionaryRegister{

  @Override
  public DictionaryListDetails getDictionaryListDetails() {
    return null;
  }
}
