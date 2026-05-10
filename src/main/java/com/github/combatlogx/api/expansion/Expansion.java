package com.github.combatlogx.api.expansion;

import org.jetbrains.annotations.NotNull;

public interface Expansion {
    @NotNull String getName();
    @NotNull ExpansionStatus getStatus();
    void reloadConfiguration();
    void onLoad();
    void onEnable();
    void onDisable();
}
