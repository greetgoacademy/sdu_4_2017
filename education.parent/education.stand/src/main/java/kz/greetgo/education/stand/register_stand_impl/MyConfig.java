package kz.greetgo.education.stand.register_stand_impl;

import kz.greetgo.conf.hot.DefaultBoolValue;
import kz.greetgo.conf.hot.DefaultIntValue;
import kz.greetgo.conf.hot.DefaultStrValue;
import kz.greetgo.conf.hot.Description;

@Description("Параметры доступа к Gmail аккаунту")
public interface MyConfig {

  @DefaultStrValue("NETNETNET@gmail.com")
  @Description("Логин аккаунта")
  String loginAccount();

  @DefaultStrValue("1234567")
  @Description("Пароль аккаунта")
  String accountPassword();

  @DefaultBoolValue(false)
  @Description("Нужно ли отправлять Email?")
  boolean needToSendEmail();

  @Description("Дня для хранения Email'ов")
  @DefaultIntValue(10)
  int getEmailSaveDays();
}
