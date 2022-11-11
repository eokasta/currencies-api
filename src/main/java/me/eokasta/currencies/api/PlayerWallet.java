package me.eokasta.currencies.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;
import java.util.Map;

public interface PlayerWallet {

    @NotNull
    String getPlayerName();

    @NotNull
    Map<String, Wallet> getWallets();

    @Nullable
    Wallet getWallet(@NotNull String currency);

    @Nullable
    Wallet getWallet(@NotNull Currency currency);

    void setWalletBalance(@NotNull String currency, @NotNull BigDecimal balance);

    void setWalletBalance(@NotNull Currency currency, @NotNull BigDecimal balance);

    boolean isDirty();

    void setDirty(boolean dirty);
}
