package com.github.combatlogx.api.tag;

import org.jetbrains.annotations.NotNull;

import com.github.combatlogx.api.player.CombatPlayer;

public interface CombatTag {
    @NotNull CombatPlayer getCombatPlayer();
    @NotNull TagType getTagType();
    @NotNull TagReason getTagReason();
    long getExpirationMillis();
    void setExpirationMillis(long expirationMillis);
    boolean isExpired();
}
