package kz.greetgo.education.register.schedulers;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.scheduling.*;
import org.fest.util.Lists;

import java.util.List;

@Bean
public class MainScheduler {

  public BeanGetter<List<HasScheduled>> scheduleBeansList;

  private Scheduler scheduler = null;

  public void startSchedulers() {
    if (scheduler != null) return;

    String configDir = System.getProperty("user.home") + "/education.d/schedule";
    TaskCollector taskCollector = new TaskCollector(configDir);

    for (HasScheduled scheduleBean : scheduleBeansList.get()) {
      taskCollector.collect(scheduleBean);
    }

    List<Task> tasks = taskCollector.getTasks();

    scheduler = new Scheduler(tasks, ExecutionPool.poolsForTasks(tasks));

    scheduler.startup();

  }

}
