package com.bridgemod;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.RandomChanceWithLootingLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class LootTables {

    private static final Identifier OAK_BRIDGE_LOOT_TABLE_ID = new Identifier("bridge", "blocks/oak_bridge");
    private static final Identifier SPIDER_LOOT_TABLE_ID = EntityType.SPIDER.getLootTableId();
    private static final Identifier CAVE_SPIDER_LOOT_TABLE_ID = EntityType.CAVE_SPIDER.getLootTableId();

    public static void modifyLootTables() {
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {

            if (OAK_BRIDGE_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(Items.OAK_PLANKS))
                        .withFunction(SetCountLootFunction.builder(ConstantLootNumberProvider.create(3.0f)).build());

                supplier.withPool(poolBuilder.build());

                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(Items.STICK))
                        .withFunction(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f)).build());

                supplier.withPool(poolBuilder2.build());
            }

            if (SPIDER_LOOT_TABLE_ID.equals(id)) {

                FabricLootPoolBuilder poolBuilder3 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceWithLootingLootCondition.builder(0.1f, 0.01f))
                        .with(ItemEntry.builder(ModItems.SPIDER_HEAD));

                supplier.withPool(poolBuilder3.build());

                FabricLootPoolBuilder poolBuilder4 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceWithLootingLootCondition.builder(0.2f, 0.01f))
                        .with(ItemEntry.builder(ModItems.SPIDER_LEG));

                supplier.withPool(poolBuilder4.build());

                FabricLootPoolBuilder poolBuilder5 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceWithLootingLootCondition.builder(0.1f, 0.01f))
                        .with(ItemEntry.builder(ModItems.SPIDER_FEET));


                supplier.withPool(poolBuilder5.build());
            }

            if (CAVE_SPIDER_LOOT_TABLE_ID.equals(id)) {

                FabricLootPoolBuilder poolBuilder6 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceWithLootingLootCondition.builder(0.1f, 0.01f))
                        .with(ItemEntry.builder(ModItems.SPIDER_HEART));

                supplier.withPool(poolBuilder6.build());

            }


        }));
    }
}
