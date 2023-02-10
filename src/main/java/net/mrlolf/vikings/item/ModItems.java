package net.mrlolf.vikings.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.mrlolf.vikings.Vikings;


public class ModItems {
    public static final Item MEAD = registerItem("mead", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Vikings.MODID, name), item);
    }
    public static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void addItemsToItemGroup(){
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, MEAD);
    }
    public static void registerModItems(){
        Vikings.LOGGER.info("Loading Items for " + Vikings.MODID);
        addItemsToItemGroup();
    }
}
