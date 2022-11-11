package me.eokasta.currencies.top;

import lombok.Data;
import me.eokasta.currencies.api.Currency;
import me.eokasta.currencies.api.TopAPI;
import org.bukkit.Location;

@Data
public abstract class TopLocation {

    protected final TopAPI topAPI;
    protected final Location location;
    protected final TopType topType;
    protected final TopViewType topViewType;
    protected final Currency currency;

    public abstract void onSpawn();

    public abstract void onRemove();

    public abstract void onUpdate();
}
