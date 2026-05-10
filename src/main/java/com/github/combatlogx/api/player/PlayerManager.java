package com.github.combatlogx.api.player;

import java.util.UUID;

import org.jetbrains.annotations.NotNull;

public interface PlayerManager {
    @NotNull CombatPlayer getCombatPlayer(@NotNull UUID playerId);
}
