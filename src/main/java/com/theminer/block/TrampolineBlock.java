package com.theminer.block;

import com.theminer.BaseMod;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class TrampolineBlock extends Block {
    private static Properties properties = Properties.of(Material.SPONGE);
    public static Block INSTANCE = new TrampolineBlock(properties).setRegistryName(BaseMod.MODID, "trampoline");
    public static Item ITEM = BlockUtils.createBlockItem(INSTANCE, CreativeModeTab.TAB_MISC);
    public TrampolineBlock(Properties properties){
        super(properties);


    }
    @Override
    public void stepOn(Level levelIn, BlockPos posIn, BlockState blockStateIn, Entity entityIn) {
        super.stepOn(levelIn, posIn, blockStateIn, entityIn);
        entityIn.setDeltaMovement(0,100,0);

    }

}