package com.theminer.item;

import com.theminer.BaseMod;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;

public class CustomArmorItem extends ArmorItem {
    private static Properties properties = new Properties().tab(CreativeModeTab.TAB_COMBAT);
    private static ArmorMaterial customMaterial = ItemUtils.buildArmorMaterial("gel", 100, new int[]{5,8,6,4} ,5,  SoundEvents.ARMOR_EQUIP_NETHERITE, 20.0f, 10.3f,"examplemod:gelore");
    public static final Item HELM = new CustomArmorItem(customMaterial, EquipmentSlot.HEAD, (properties)).setRegistryName(BaseMod.MODID, "gel_armor_helmet");
    public static final Item CHEST = new CustomArmorItem(customMaterial, EquipmentSlot.CHEST, (properties)).setRegistryName(BaseMod.MODID, "gel_armor_chestplate");
    public static final Item LEGGINGS = new CustomArmorItem(customMaterial, EquipmentSlot.LEGS, (properties)).setRegistryName(BaseMod.MODID, "gel_armor_leggings");
    public static final Item BOOTS = new CustomArmorItem(customMaterial, EquipmentSlot.FEET,(properties)).setRegistryName(BaseMod.MODID, "gel_armor_boots");

    public CustomArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
        super(material, slot, properties);

    }
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        if(slot == EquipmentSlot.LEGS){
            return "essentialmod:textures/models/armor/custom_armor_layer_2.png";
        }else{
            return "essentialmod:textures/models/armor/custom_armor_layer_1.png";
        }
    }
}
