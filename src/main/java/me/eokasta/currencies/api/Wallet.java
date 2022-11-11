package me.eokasta.currencies.api;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public interface Wallet {

    @NotNull
    Currency getCurrency();

    @NotNull
    BigDecimal getBalance();

    void setBalance(@NotNull BigDecimal balance);
}
