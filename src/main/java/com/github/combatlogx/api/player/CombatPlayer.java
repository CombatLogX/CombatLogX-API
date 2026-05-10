package com.github.combatlogx.api.player;

import java.util.UUID;

import org.jetbrains.annotations.NotNull;

public interface CombatPlayer {
    @NotNull UUID getUniqueId();
    boolean isOnline();
}
