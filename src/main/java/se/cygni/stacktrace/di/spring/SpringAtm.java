package se.cygni.stacktrace.di.spring;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import se.cygni.stacktrace.di.Atm;
import se.cygni.stacktrace.di.AtmTransport;

@Component
public class SpringAtm implements Atm {
    private final AtmTransport transport;

    @Autowired
    public SpringAtm(final AtmTransport transport) {
        this.transport = transport;
    }

    private byte[] createData() {
        return "testdata".getBytes();
    }

    public void deposit(final BigDecimal bd) {
        System.out.println("Spring: deposit called");
        transport.communicateWithBank(createData());
    }

    public void withdraw(final BigDecimal bd) {
        System.out.println("Spring: withdraw called");
        transport.communicateWithBank(createData());
    }
}
