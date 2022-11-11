package me.eokasta.currencies.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public interface PlayerWalletAPI {

    /**
     * Get the currency by the id.
     *
     * @param id The id of the currency.
     * @return The currency.
     */
    @Nullable
    Currency getCurrency(@NotNull String id);

    /**
     * Get the player wallet by the unique id.
     *
     * @param playerName The name of the player.
     * @return CompletableFuture of the player wallet.
     */
    @NotNull
    CompletableFuture<PlayerWallet> getPlayerWallet(@NotNull String playerName, boolean onlyCache);

    /**
     * Update the player wallet.
     *
     * @param playerWallet The player wallet.
     * @return CompletableFuture of update operation.
     */
    CompletableFuture<Void> updatePlayerWallet(@NotNull PlayerWallet playerWallet);

    /**
     * Update the player specific wallet.
     *
     * @param playerWallet The player wallet.
     * @param wallet       The wallet.
     * @return CompletableFuture of update operation.
     */
    CompletableFuture<Void> updatePlayerWallet(@NotNull PlayerWallet playerWallet, @NotNull Wallet wallet);

    /**
     * Update all player wallets.
     *
     * <p>
     *     This method is used to update all dirty player wallets.
     *     This method is called automatically when the plugin is disabled and every X minutes.
     *     The X minutes is defined in the config.yml.
     * </p>
     * <p>
     *     <b>This method is not recommended to be used in synchronous code.</b>
     * </p>
     */
    void updateAllPlayerWallets();

    /**
     * Create new player wallet.
     *
     * @param playerName The exact player name.
     * @return The new player wallet.
     */
    @NotNull
    PlayerWallet createPlayerWallet(@NotNull String playerName);
}
