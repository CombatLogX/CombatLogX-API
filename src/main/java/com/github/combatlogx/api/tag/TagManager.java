package com.github.combatlogx.api.tag;

import java.util.List;

import org.jetbrains.annotations.NotNull;

import com.github.combatlogx.api.player.CombatPlayer;

public interface TagManager {
    boolean addTag(@NotNull CombatPlayer player, @NotNull CombatTag tag);
    void untag(@NotNull CombatPlayer player, @NotNull CombatTag tag, @NotNull UntagReason reason);
    boolean isTagged(@NotNull CombatPlayer player);
    @NotNull List<CombatTag> getTags(@NotNull CombatPlayer player);
    @NotNull List<CombatPlayer> getTaggedPlayers();
}
