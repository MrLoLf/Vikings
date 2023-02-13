package net.mrlolf.vikings.item;


import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricShieldItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.mrlolf.vikings.Vikings;


public class ModItems {
    public static final Item MEAD = registerItem("mead", new Item(new FabricItemSettings()));
    // FabricShieldItem(settings.maxDamage(durability), cooldownTicks, enchantability, repairItem)
    public static final Item WARRIOR_SHIELD = registerItem("warrior_shield", new FabricShieldItem(new FabricItemSettings().maxDamage(2500), 10, 13, Items.IRON_INGOT));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Vikings.MODID, name), item);
    }
    public static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void addItemsToItemGroup(){
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, MEAD);
        addToItemGroup(ItemGroups.COMBAT, WARRIOR_SHIELD);
    }
    public static void registerModItems(){
        Vikings.LOGGER.info("Loading Items for " + Vikings.MODID);
        addItemsToItemGroup();
    }
}
