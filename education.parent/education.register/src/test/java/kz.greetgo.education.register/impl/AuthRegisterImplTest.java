package kz.greetgo.education.register.impl;

import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.depinject.testng.AbstractDepinjectTestNg;
import kz.greetgo.depinject.testng.ContainerConfig;
import kz.greetgo.education.controller.model.AuthInfo;
import kz.greetgo.education.controller.register.AuthRegister;
import kz.greetgo.education.register.test.dao.AuthTestDao;
import kz.greetgo.education.register.test.util.BeanConfigMainPostgresTests;
import kz.greetgo.util.RND;
import org.fest.assertions.api.Assertions;
import org.testng.annotations.Test;

import static org.fest.assertions.api.Assertions.assertThat;

@ContainerConfig(BeanConfigMainPostgresTests.class)
public class AuthRegisterImplTest extends AbstractDepinjectTestNg{
  public BeanGetter<AuthTestDao> authTestDao;
  public BeanGetter<AuthRegister> authRegister;

  @Test
  public void sysdate(){
    System.out.println("db date with mybatis:"+authTestDao.get().getSysdate());
    System.out.println("db date with authRegister"+authRegister.get().getSysdate());
  }

  @Test
  public void getAutoInfo2(){
    String id= RND.intStr(15);
    String accountName=RND.str(20);
    String enPassword= RND.str(30);

    authTestDao.get().insertPerson(id,accountName,enPassword);
    AuthInfo autoInfo = authRegister.get().getAutoInfo2(accountName, enPassword);

    assertThat(autoInfo).isNotNull();
    assertThat(autoInfo.personId).isEqualTo(id);
    assertThat(autoInfo.token).isNotEmpty();

  }
}
