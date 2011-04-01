package se.cygni.stacktrace.di.guice;

import java.math.BigDecimal;

import se.cygni.stacktrace.di.Atm;
import se.cygni.stacktrace.di.AtmTransport;

import com.google.inject.Inject;

public class GuiceAtm implements Atm {
    private final AtmTransport transport;

    @Inject
    public GuiceAtm(final AtmTransport transport) {
        this.transport = transport;
    }

    private byte[] createData() {
        return "testdata".getBytes();
    }

    public void deposit(final BigDecimal bd) {
        System.out.println("Guice: deposit called");
        transport.communicateWithBank(createData());
    }

    public void withdraw(final BigDecimal bd) {
        System.out.println("Guice: withdraw called");
        transport.communicateWithBank(createData());
    }
}
