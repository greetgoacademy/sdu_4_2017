package kz.greetgo.education.controller.controller;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.education.controller.utils.Controller;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.ParPath;

@Bean
@Mapping("/email")
public class EmailSendController implements Controller{

  @Mapping("/{genNumber}")
  public void sentEmail(@ParPath("genNumber") String genNumber){

  }
}
