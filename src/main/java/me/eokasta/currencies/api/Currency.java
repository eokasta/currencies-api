package me.eokasta.currencies.api;

import org.bukkit.ChatColor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface Currency {

    @NotNull
    String getId();

    @NotNull
    String getDisplayName();

    @NotNull
    String getSymbol();

    @NotNull
    ChatColor getColor();

    @NotNull
    List<String> getAliases();

    boolean hasShop();

    @NotNull
    List<String> getShopCommands();

    boolean isFormatWithSuffix();
}
