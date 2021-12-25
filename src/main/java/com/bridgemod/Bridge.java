package com.bridgemod;

import net.fabricmc.api.ModInitializer;

public class Bridge implements ModInitializer {

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        LootTables.modifyLootTables();
    }
}
