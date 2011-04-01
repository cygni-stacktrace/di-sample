package se.cygni.stacktrace.di.config;

import se.cygni.stacktrace.di.Atm;
import se.cygni.stacktrace.di.AtmTransport;
import se.cygni.stacktrace.di.guice.GuiceAtm;
import se.cygni.stacktrace.di.guice.GuiceTransport;

import com.google.inject.AbstractModule;

/** Simple Guice-configuration */
public class GuiceConfig extends AbstractModule {
    @Override
    protected void configure() {
        bind(Atm.class).to(GuiceAtm.class);
        bind(AtmTransport.class).to(GuiceTransport.class);
    }
}
