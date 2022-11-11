package me.eokasta.currencies.api;

import me.eokasta.currencies.top.TopLocation;
import me.eokasta.currencies.top.TopType;
import me.eokasta.currencies.top.TopViewType;
import org.bukkit.Location;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public interface TopAPI {

    @NotNull
    Map<Location, TopLocation> getTopLocations();

    TopLocation createTopLocation(
            @NotNull Location location, @NotNull TopViewType viewType, TopType type, @NotNull Currency currency);

    TopLocation getNearbyTopLocation(@NotNull Location location, double distance);

    void deleteTopLocation(@NotNull Location location);

    void shutdown();

    @Nullable
    Top getTopModel(@NotNull Currency currency);
}
