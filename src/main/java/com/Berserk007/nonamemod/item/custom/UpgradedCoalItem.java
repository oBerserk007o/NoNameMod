package com.Berserk007.nonamemod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class UpgradedCoalItem extends Item {
    public UpgradedCoalItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 3200;
    }
}
