package se.cygni.stacktrace.di.cdi;

import javax.inject.Named;

import se.cygni.stacktrace.di.AtmTransport;

@Named
public class CdiTransport implements AtmTransport {
    public void communicateWithBank(final byte[] datapacket) {
        System.out.println("CDI transport - wow!");
    }
}