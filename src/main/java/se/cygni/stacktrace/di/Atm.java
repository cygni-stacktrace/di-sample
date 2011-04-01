package se.cygni.stacktrace.di;

import java.math.BigDecimal;

public interface Atm {
    void deposit(BigDecimal bd);

    void withdraw(BigDecimal bd);
}
