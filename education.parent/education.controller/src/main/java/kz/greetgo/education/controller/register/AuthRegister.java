  package kz.greetgo.education.controller.register;

import kz.greetgo.education.controller.model.AuthInfo;

import java.util.Date;

  public interface AuthRegister {

    AuthInfo getAutoInfo(String accountName, String password);

    AuthInfo getAutoInfo2(String accountName, String password);

  Date getSysdate();
}
