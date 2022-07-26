package com.Berserk007.nonamemod.util;

import com.Berserk007.nonamemod.NoNameMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static void register() {
        Blocks.registerBlockTags();
        Items.registerItemTags();
    }

    public static class Blocks {
        private static Tags.IOptionalNamedTag<Block> tag(String name) {
            return BlockTags.createOptional(new ResourceLocation(NoNameMod.MOD_ID, name));
        }
        private static Tags.IOptionalNamedTag<Block> forgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }
        public static void registerBlockTags() {

        }
    }

    public static class Items {
        private static Tags.IOptionalNamedTag<Item> tag(String name) {
            return ItemTags.createOptional(new ResourceLocation(NoNameMod.MOD_ID, name));
        }
        private static Tags.IOptionalNamedTag<Item> forgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
        public static void registerItemTags() {

        }
    }
}
