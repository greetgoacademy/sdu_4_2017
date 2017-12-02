package kz.greetgo.education.register.beans.all.any_db;

import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.BeanScanner;
import kz.greetgo.depinject.core.Include;
import kz.greetgo.education.controller.controller.BeanConfigControllers;
import kz.greetgo.education.register.impl.BeanConfigRegisterImpl;
import kz.greetgo.education.register.schedulers.BeanConfigScheduler;

@BeanConfig
@BeanScanner
@Include({BeanConfigRegisterImpl.class, BeanConfigControllers.class, BeanConfigScheduler.class})
public class BeanConfigAll {
}
