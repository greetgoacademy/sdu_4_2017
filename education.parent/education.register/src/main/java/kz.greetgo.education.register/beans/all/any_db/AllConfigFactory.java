package kz.greetgo.education.register.beans.all.any_db;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.education.register.config.DbConfig;
import kz.greetgo.education.register.util.LocalConfigFactory;

@Bean
public class AllConfigFactory extends LocalConfigFactory {

  @Bean
  public DbConfig createPostgresDbConfig() {
    return createConfig(DbConfig.class);
  }

}
