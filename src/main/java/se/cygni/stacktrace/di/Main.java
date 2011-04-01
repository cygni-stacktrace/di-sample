package se.cygni.stacktrace.di;

import java.math.BigDecimal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import se.cygni.stacktrace.di.config.CdiConfig;
import se.cygni.stacktrace.di.config.GuiceConfig;
import se.cygni.stacktrace.di.config.SpringConfig;

import com.google.inject.Guice;

public class Main {
    public static void main(final String[] args) {
        // CDI via Spring
        final Atm cdiAtm = new AnnotationConfigApplicationContext(CdiConfig.class).getBean(Atm.class);
        cdiAtm.deposit(new BigDecimal(1000));

        // Guice
        final Atm guiceAtm = Guice.createInjector(new GuiceConfig()).getInstance(Atm.class);
        guiceAtm.deposit(new BigDecimal(2000));

        // Spring via Spring
        final Atm springAtm = new AnnotationConfigApplicationContext(SpringConfig.class).getBean(Atm.class);
        springAtm.deposit(new BigDecimal(3000));
    }
}
