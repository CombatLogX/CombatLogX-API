package com.github.combatlogx.api;

import org.jetbrains.annotations.NotNull;

import com.github.combatlogx.api.expansion.ExpansionManager;
import com.github.combatlogx.api.player.PlayerManager;
import com.github.combatlogx.api.tag.TagManager;
import com.github.combatlogx.api.timer.TimerManager;

public interface CombatLogX {
    void reloadConfiguration();
    @NotNull ExpansionManager getExpansionManager();
    @NotNull PlayerManager getDataManager();
    @NotNull TagManager getTagManager();
    @NotNull TimerManager getTimerManager();
}
