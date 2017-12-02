package kz.greetgo.education.register.impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.education.controller.model.AuthInfo;
import kz.greetgo.education.controller.register.AuthRegister;
import kz.greetgo.education.controller.register.SendEmailRegister;
import kz.greetgo.education.register.dao.AuthDao;
import kz.greetgo.education.register.util.GCommonConstant;
import kz.greetgo.email.Email;
import kz.greetgo.email.EmailSender;
import kz.greetgo.email.EmailSenderController;
import kz.greetgo.util.RND;

import java.util.Date;

@Bean
public class AuthRegisterImpl implements AuthRegister{

  public BeanGetter<AuthDao> authDao;

  @Override
  public AuthInfo getAutoInfo(String accountName, String password) {
    AuthInfo ret=new AuthInfo();
    ret.personId=authDao.get().getPersonId(accountName,password);
    ret.token= RND.str(15);
    return ret;
  }

  @Override
  public AuthInfo getAutoInfo2(String accountName, String password) {
    AuthInfo ret=authDao.get().getPersonIdByObject(accountName,password);
    ret.token=RND.str(15);
    return ret;
  }

  @Override
  public Date getSysdate() {
    return authDao.get().getSysdate();
  }
}
