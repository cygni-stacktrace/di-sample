package se.cygni.stacktrace.di.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import se.cygni.stacktrace.di.cdi.CdiAtm;

/** Spring 3.1 configuration with component scanning */
@Configuration
@ComponentScan(basePackageClasses = CdiAtm.class)
public class CdiConfig {
    // No impl. needed - only annotations are used
}
