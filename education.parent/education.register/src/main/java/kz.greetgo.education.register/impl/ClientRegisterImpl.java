package kz.greetgo.education.register.impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.education.controller.model.AuthInfo;
import kz.greetgo.education.controller.model.ClientInfo;
import kz.greetgo.education.controller.model.ClientListDetails;
import kz.greetgo.education.controller.register.AuthRegister;
import kz.greetgo.education.controller.register.ClientRegister;

@Bean
public class ClientRegisterImpl implements ClientRegister{

  @Override
  public ClientListDetails getClientList() {
    return null;
  }

  @Override
  public ClientInfo getClientInfo(String clientId) {
    return null;
  }

  @Override
  public ClientInfo saveClientInfo(ClientInfo clientInfo) {
    return null;
  }

  @Override
  public Void deleteClientInfo(String clientId) {
    return null;
  }
}
