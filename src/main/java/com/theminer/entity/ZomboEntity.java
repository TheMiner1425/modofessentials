package com.theminer.entity;

import com.theminer.BaseMod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class ZomboEntity extends Zombie {
    public static EntityType<ZomboEntity> TYPE = (EntityType<ZomboEntity>)
            EntityType.Builder.of(ZomboEntity::new, MobCategory.MONSTER)
                    .build("zombo")
                    .setRegistryName(BaseMod.MODID, "zombo");
    public static Item EGG = EntityUtils.buildEntitySpawnEgg(TYPE, 0xb00101, 0xacbf1f);
    public ZomboEntity(EntityType<? extends Zombie> type, Level level) {
        super(type, level);

        }
    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes().add(Attributes.ATTACK_DAMAGE, (double)0.23F).add(Attributes.SPAWN_REINFORCEMENTS_CHANCE);
    }
}


