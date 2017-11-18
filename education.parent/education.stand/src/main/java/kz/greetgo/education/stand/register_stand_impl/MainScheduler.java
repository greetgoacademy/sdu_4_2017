package kz.greetgo.education.stand.register_stand_impl;

import kz.greetgo.depinject.Depinject;
import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.gen.DepinjectUtil;
import kz.greetgo.education.stand.bean_containers.StandBeanContainer;
import kz.greetgo.scheduling.*;

import java.util.List;

@Bean
public class MainScheduler {

  private Scheduler scheduler = null;

  public void startSchedulers(MyTask myTask) {
    if (scheduler != null) return;

    String configDir = System.getProperty("user.home") + "/education.d";
    TaskCollector taskCollector = new TaskCollector(configDir);

    taskCollector.collect(myTask);

    List<Task> tasks = taskCollector.getTasks();

    scheduler = new Scheduler(tasks, ExecutionPool.poolsForTasks(tasks));

    scheduler.startup();

  }

}
