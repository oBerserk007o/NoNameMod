package com.Berserk007.nonamemod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class ItemGeneratorBlock extends Block {
    public ItemGeneratorBlock(Properties properties) {
        super(properties);
    }

    Random random = new Random();

    public @NotNull InteractionResult use(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hit) {
        int randomID = this.random.nextInt(1324) + 1;
        ItemEntity itemEntity = new ItemEntity(level, pos.getX(), pos.getY() + 0.5f, pos.getZ(), new ItemStack(Item.byId(randomID)));
        player.sendMessage(new TextComponent("Block was used! Item: " + Item.byId(randomID) + ", ID:" + randomID), player.getUUID());
        itemEntity.setDefaultPickUpDelay();
        level.addFreshEntity(itemEntity);
        return super.use(state, level, pos, player, hand, hit);
    }

}
