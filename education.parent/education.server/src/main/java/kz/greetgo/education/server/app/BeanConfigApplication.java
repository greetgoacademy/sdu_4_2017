package kz.greetgo.education.server.app;

import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.Include;
import kz.greetgo.education.register.beans.all.any_db.BeanConfigAll;
import kz.greetgo.education.register.beans.all.postgres.BeanConfigAllPostgres;
import kz.greetgo.education.server.beans.BeanConfigServer;

@BeanConfig
@Include({BeanConfigServer.class, BeanConfigAllPostgres.class})
public class BeanConfigApplication {}
