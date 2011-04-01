package se.cygni.stacktrace.di.guice;

import se.cygni.stacktrace.di.AtmTransport;

public class GuiceTransport implements AtmTransport {
    public void communicateWithBank(final byte[] datapacket) {
        System.out.println("Guice transport - googly!");
    }
}
