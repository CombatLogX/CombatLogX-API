package com.github.combatlogx.api;

import com.github.combatlogx.api.expansion.ExpansionManager;
import com.github.combatlogx.api.player.PlayerManager;
import com.github.combatlogx.api.tag.TagManager;

public interface CombatLogX {
    void reloadConfiguration();
    ExpansionManager getExpansionManager();
    PlayerManager getDataManager();
    TagManager getTagManager();
}
