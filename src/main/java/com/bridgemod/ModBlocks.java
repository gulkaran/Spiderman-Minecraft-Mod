package com.bridgemod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final SlabBlock OAK_BRIDGE = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(2f, 15f).sounds(BlockSoundGroup.WOOD));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier("bridge", "oak_bridge"), OAK_BRIDGE);
        Registry.register(Registry.ITEM, new Identifier("bridge", "oak_bridge"), new BlockItem(OAK_BRIDGE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
