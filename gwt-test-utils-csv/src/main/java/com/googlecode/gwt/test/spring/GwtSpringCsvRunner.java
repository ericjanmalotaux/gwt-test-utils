package com.googlecode.gwt.test.spring;

import com.googlecode.gwt.test.internal.junit.AbstractGwtRunner;
import com.googlecode.gwt.test.internal.junit.AbstractGwtRunnerFactory;

public class GwtSpringCsvRunner extends AbstractGwtRunner {

    public GwtSpringCsvRunner(Class<?> clazz) throws Throwable {
        super(clazz);
    }

    @Override
    protected AbstractGwtRunnerFactory getRunnerFactory() {
        return new GwtSpringCsvRunnerFactory();
    }

}
