package com.github.combatlogx.api.timer;

import java.util.List;

import org.jetbrains.annotations.NotNull;

import com.github.combatlogx.api.player.CombatPlayer;

public interface TimerManager {
    void addTimerTask(@NotNull TimerTask task);
    void removeAllTasks(@NotNull CombatPlayer player);
    List<TimerTask> getAllTimerTasks();
}
