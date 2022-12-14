package com.theminer.block;

import com.theminer.BaseMod;
import com.theminer.Utils;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

import javax.annotation.Nullable;

public class CreeperSurpriseBlock extends Block {
    private static Properties properties = Properties.of(Material.STONE);
    public static Block INSTANCE = new CreeperSurpriseBlock(properties).setRegistryName(BaseMod.MODID, "creepersurprise");
    public static Item ITEM = BlockUtils.createBlockItem(INSTANCE, CreativeModeTab.TAB_MISC);
    public CreeperSurpriseBlock(Properties properties){
        super(properties);
    }
    @Override
    public void playerDestroy(Level level, Player player, BlockPos pos, BlockState blockState, @Nullable BlockEntity blockEntity, ItemStack stack) {
        super.playerDestroy(level, player, pos, blockState, blockEntity, stack);
        Creeper creeper = new Creeper(EntityType.CREEPER, level);
        Utils.spawnEntity(level, creeper, pos);
    }
}
