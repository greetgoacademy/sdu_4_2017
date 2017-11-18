package kz.greetgo.education.register.config;


import kz.greetgo.conf.hot.DefaultStrValue;
import kz.greetgo.conf.hot.Description;

@Description("Параметры доступа к БД (используется только БД Postgresql)")
public interface DbConfig {

  @Description("URL доступа к БД")
  @DefaultStrValue("jdbc:postgres:localhost:5432/education")
  String url();

  @Description("Пользователь для доступа к БД")
  @DefaultStrValue("education")
  String username();

  @Description("Пароль для доступа к БД")
  @DefaultStrValue("education")
  String password();
}
