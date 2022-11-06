package com.theminer.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ItemMod {

    //BASIC ITEMS
    public static final Item STRUCTURE_GEL = ItemUtils.buildBasicItem("structuregel", CreativeModeTab.TAB_MISC);
    public static final Item GEL_ORE = ItemUtils.buildBasicItem("gelore",CreativeModeTab.TAB_MISC);
    public static final Item MONEY = ItemUtils.buildBasicItem("money",CreativeModeTab.TAB_MISC);
    public static final Item GEM = ItemUtils.buildBasicItem("gem",CreativeModeTab.TAB_MISC);
    //FOODS

    public static FoodProperties hotTamales = (new FoodProperties.Builder().nutrition(20).saturationMod(2.5f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 86400000, 255), 1.0f).alwaysEat().build());
    public static FoodProperties pizzaProperties = (new FoodProperties.Builder().nutrition(17).saturationMod(9.5f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 30000, 255), 0.5f).alwaysEat().build());
    public static final Item pizza = ItemUtils.buildFoodItem("pizza", pizzaProperties);
    public static Item hotTamalesFood = ItemUtils.buildFoodItem("tamales", hotTamales);
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        //BASIC ITEMS
        event.getRegistry().register(STRUCTURE_GEL);
        event.getRegistry().register(GEL_ORE);
        event.getRegistry().register(MONEY);

        // ITEMS
        event.getRegistry().register(GEM);
        event.getRegistry().register(TeleportRodItem.INSTANCE);
        event.getRegistry().register(LightningHammerItem.INSTANCE);
        // TOOLS
        event.getRegistry().register(GelPickaxeItem.INSTANCE);

        // FOOD
        event.getRegistry().register(hotTamalesFood);
        event.getRegistry().register(pizza);
        // ARMOR
        event.getRegistry().register(CustomArmorItem.HELM);
        event.getRegistry().register(CustomArmorItem.CHEST);
        event.getRegistry().register(CustomArmorItem.BOOTS);
        event.getRegistry().register(CustomArmorItem.LEGGINGS);

        //PROJECTILES

        //COMBAT
        event.getRegistry().register(GelSwordItem.INSTANCE);

    }
}
