package me.eokasta.currencies.api;

import me.eokasta.currencies.top.TopType;

import java.util.List;

public interface Top {

    Currency getCurrency();

    List<TopWallet> getTopByBalance();

    List<TopWallet> getTopByTime();

    void setTopByBalance(List<TopWallet> topByBalance);

    void setTopByTime(List<TopWallet> topByTime);

    List<TopWallet> getTopWallet(TopType type);


}
