package se.cygni.stacktrace.di.spring;

import org.springframework.stereotype.Component;

import se.cygni.stacktrace.di.AtmTransport;

@Component
public class SpringTransport implements AtmTransport {
    public void communicateWithBank(final byte[] datapacket) {
        System.out.println("Spring transport - yey!");
    }
}
