package kz.greetgo.education.register.test.util;

import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.Include;
import kz.greetgo.education.register.beans.all.postgres.BeanConfigAllPostgres;
import kz.greetgo.education.register.dao.postgres.BeanConfigPostgresDao;
import kz.greetgo.education.register.test.dao.postgres.BeanTestConfigPostgresDao;

@BeanConfig
@Include({BeanConfigAllPostgres.class,BeanConfigPostgresDao.class, BeanTestConfigPostgresDao.class})
public class BeanConfigMainPostgresTests {
}
