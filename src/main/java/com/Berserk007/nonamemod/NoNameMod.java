package com.Berserk007.nonamemod;

import com.Berserk007.nonamemod.block.ModBlocks;
import com.Berserk007.nonamemod.enchantment.ModEnchantments;
import com.Berserk007.nonamemod.item.ModItems;
import com.Berserk007.nonamemod.util.ModTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(NoNameMod.MOD_ID)
public class NoNameMod
{
    public static final String MOD_ID = "nonamemod";

    private static final Logger LOGGER = LogManager.getLogger();


    public NoNameMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModEnchantments.register(eventBus);

        ModTags.register();

        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
