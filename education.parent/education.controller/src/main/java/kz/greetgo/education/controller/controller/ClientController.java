package kz.greetgo.education.controller.controller;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.education.controller.model.ClientInfo;
import kz.greetgo.education.controller.model.ClientListDetails;
import kz.greetgo.education.controller.model.IntroductionInfo;
import kz.greetgo.education.controller.utils.Controller;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.ToJson;

import java.util.Date;

@Bean
@Mapping("/client")
public class ClientController implements Controller {

  @ToJson()
  @Mapping("/list")
  public ClientListDetails getClientList() {
    ClientListDetails details=new ClientListDetails();
    {
      ClientInfo clientInfo = new ClientInfo();
      clientInfo.id = "1";
      clientInfo.surname = "Tursyn";
      clientInfo.name = "Seiit";
      clientInfo.patronymic = "Nurmuhanbetuli";
      clientInfo.birthDate = new Date();
      clientInfo.age = 24;
      details.clientInfoList.add(clientInfo);
    }
    {
      ClientInfo clientInfo = new ClientInfo();
      clientInfo.id = "2";
      clientInfo.surname = "Tursyn";
      clientInfo.name = "Seiit";
      clientInfo.patronymic = "Nurmuhanbetuli";
      clientInfo.birthDate = new Date();
      clientInfo.age = 24;
      details.clientInfoList.add(clientInfo);
    }
    return details;
  }


}
