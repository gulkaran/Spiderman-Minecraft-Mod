package com.bridgemod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // bridge items
    public static final Item ROPE = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item ROPE_PILE = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    // spider armour items
    public static final Item SPIDER_HEAD = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item SPIDER_FEET = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item SPIDER_HEART = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item SPIDER_LEG = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    // spiderman armor

    public static final ArmorMaterial SPIDERMAN = new CustomArmorMaterial();

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("bridge", "rope"), ROPE);
        Registry.register(Registry.ITEM, new Identifier("bridge", "rope_pile"), ROPE_PILE);

        Registry.register(Registry.ITEM, new Identifier("bridge", "spider_head"), SPIDER_HEAD);
        Registry.register(Registry.ITEM, new Identifier("bridge", "spider_feet"), SPIDER_FEET);
        Registry.register(Registry.ITEM, new Identifier("bridge", "spider_heart"), SPIDER_HEART);
        Registry.register(Registry.ITEM, new Identifier("bridge", "spider_leg"), SPIDER_LEG);

        Registry.register(Registry.ITEM, new Identifier("bridge", "spiderman_helmet"), new ArmorItem(SPIDERMAN, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier("bridge", "spiderman_chestplate"), new ArmorItem(SPIDERMAN, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier("bridge", "spiderman_legging"), new ArmorItem(SPIDERMAN, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier("bridge", "spiderman_boots"), new ArmorItem(SPIDERMAN, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT)));
    }
}
