package me.eokasta.currencies.api;

import java.math.BigDecimal;

public interface TopWallet {

    int getPosition();

    String getPlayerName();

    Currency getCurrency();

    BigDecimal getBalance();

    long getTimeInMinutes();

    void setTimeInMinutes(long timeInMinutes);
}
