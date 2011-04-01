package se.cygni.stacktrace.di.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import se.cygni.stacktrace.di.spring.SpringAtm;

/** Spring 3.1 configuration with component scanning */
@Configuration
@ComponentScan(basePackageClasses = SpringAtm.class)
public class SpringConfig {
    // No impl. needed - only annotations are used
}
