package com.github.combatlogx.api.timer;

import org.jetbrains.annotations.NotNull;

import com.github.combatlogx.api.player.CombatPlayer;

public interface TimerTask {
    void update(@NotNull CombatPlayer player, long timeLeftMillis);
    void remove(@NotNull CombatPlayer player);
}
