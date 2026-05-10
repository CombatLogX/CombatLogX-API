package com.github.combatlogx.api.expansion;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ExpansionManager {
    @Nullable Expansion getExpansion(@NotNull String name);
}
