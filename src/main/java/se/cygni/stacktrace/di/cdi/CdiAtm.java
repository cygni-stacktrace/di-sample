package se.cygni.stacktrace.di.cdi;

import java.math.BigDecimal;

import javax.inject.Inject;
import javax.inject.Named;

import se.cygni.stacktrace.di.Atm;
import se.cygni.stacktrace.di.AtmTransport;

@Named("Atm")
public class CdiAtm implements Atm {
    private final AtmTransport transport;

    @Inject
    public CdiAtm(final AtmTransport transport) {
        this.transport = transport;
    }

    private byte[] createData() {
        return "testdata".getBytes();
    }

    public void deposit(final BigDecimal bd) {
        System.out.println("CDI: deposit called");
        transport.communicateWithBank(createData());
    }

    public void withdraw(final BigDecimal bd) {
        System.out.println("CDI: withdraw called");
        transport.communicateWithBank(createData());
    }
}
