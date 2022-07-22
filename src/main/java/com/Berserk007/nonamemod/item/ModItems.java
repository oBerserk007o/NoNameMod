package com.Berserk007.nonamemod.item;

import com.Berserk007.nonamemod.NoNameMod;
import com.Berserk007.nonamemod.item.custom.FireballStaffItem;
import com.Berserk007.nonamemod.item.custom.LightningStaffItem;
import com.Berserk007.nonamemod.item.custom.UpgradedCoalItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NoNameMod.MOD_ID);

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
           () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NONAMEMOD_TAB)));

    public static final RegistryObject<Item> STEEL_BEED = ITEMS.register("steel_beed",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NONAMEMOD_TAB)));

    public static final RegistryObject<Item> PYRO_CONDENSATE= ITEMS.register("pyro_condensate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NONAMEMOD_TAB)));

    public static final RegistryObject<Item> RAW_PYRO_CONDENSATE = ITEMS.register("raw_pyro_condensate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NONAMEMOD_TAB)));

    public static final RegistryObject<Item> ELECTRO_CONDENSATE = ITEMS.register("electro_condensate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NONAMEMOD_TAB)));

    public static final RegistryObject<Item> RAW_ELECTRO_CONDENSATE = ITEMS.register("raw_electro_condensate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NONAMEMOD_TAB)));


    public static final RegistryObject<Item> UPGRADED_COAL = ITEMS.register("upgraded_coal",
            () -> new UpgradedCoalItem(new Item.Properties().tab(ModCreativeModeTab.NONAMEMOD_TAB)));

    public static final RegistryObject<Item> FIREBALL_STAFF = ITEMS.register("fireball_staff",
            () -> new FireballStaffItem(new Item.Properties().tab(ModCreativeModeTab.NONAMEMOD_TAB).durability(100)));

    public static final RegistryObject<Item> LIGHTNING_STAFF = ITEMS.register("lightning_staff",
            () -> new LightningStaffItem(new Item.Properties().tab(ModCreativeModeTab.NONAMEMOD_TAB).durability(100)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
