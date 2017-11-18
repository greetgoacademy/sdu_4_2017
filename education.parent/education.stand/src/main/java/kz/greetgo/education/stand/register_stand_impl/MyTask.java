package kz.greetgo.education.stand.register_stand_impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.scheduling.FromConfig;
import kz.greetgo.scheduling.HasScheduled;
import kz.greetgo.scheduling.Scheduled;

import java.io.File;
import java.io.IOException;

@Bean
public class MyTask implements HasScheduled{

  @FromConfig("Параметры запуска шедула по файлам")
  @Scheduled("повторять каждые 10 сек, начиная с паузы 17 сек")
  public void doAJob() throws IOException {
    File file  = new File(System.getProperty("user.home")
      + "/education.d/"
      + System.currentTimeMillis());
    File parentFile = file.getParentFile();
    if (!parentFile.exists())
      parentFile.mkdirs();
    file.createNewFile();
  }

  @Scheduled("23:00")
  public void task2() {
    // Do nothing
  }



}
