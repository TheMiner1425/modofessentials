package com.theminer.block;

import com.theminer.BaseMod;
import com.theminer.Utils;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;


import java.util.Random;

public class CreepingMoldBlock extends Block {
    private static Properties properties = Properties.of(Material.STONE).randomTicks();
    public static Block INSTANCE = new CreepingMoldBlock(properties).setRegistryName(BaseMod.MODID, "creepingmold");
    public static Item ITEM = BlockUtils.createBlockItem(INSTANCE, CreativeModeTab.TAB_MISC);
    public CreepingMoldBlock(Properties properties){
        super(properties);

        }
    @Override
    public void randomTick (BlockState blockState, ServerLevel serverLevel, BlockPos pos, Random random){
        super.randomTick(blockState, serverLevel, pos, random);
        BlockPos blockPos = Utils.findNeightborBlock(pos);
        if (blockPos != null) {
            serverLevel.setBlockAndUpdate(blockPos, this.defaultBlockState());
        }
    }

}
