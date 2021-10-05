package com.infamous.dungeons_mobs.mobenchants;

import com.infamous.dungeons_libraries.mobenchantments.MobEnchantment;
import com.infamous.dungeons_libraries.mobenchantments.MobEnchantmentHelper;
import com.infamous.dungeons_mobs.config.DungeonsMobsConfig;
import net.minecraft.entity.Entity;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static com.infamous.dungeons_libraries.mobenchantments.MobEnchantmentsRegistry.MOB_ENCHANTMENTS;

public class MobEnchantmentSelector {

    public static MobEnchantment getRandomMobEnchantment(Entity entity, Random random) {
        List<MobEnchantment> mobEnchantments = MOB_ENCHANTMENTS.getValues()
                .stream()
                .filter(MobEnchantmentSelector::isDisabled)
                .filter(mobEnchantment -> MobEnchantmentHelper.hasType(mobEnchantment, MobEnchantmentHelper.getPossibleTypes(entity)))
                .collect(Collectors.toList());
        return MobEnchantmentHelper.getRandomMobEnchantment(random, mobEnchantments);
    }

    public static MobEnchantment getRandomMobEnchantment(Random random) {
        List<MobEnchantment> mobEnchantments = MOB_ENCHANTMENTS.getValues()
                .stream()
                .filter(MobEnchantmentSelector::isDisabled)
                .collect(Collectors.toList());
        return MobEnchantmentHelper.getRandomMobEnchantment(random, mobEnchantments);
    }

    private static boolean isDisabled(MobEnchantment mobEnchantment) {
        return !DungeonsMobsConfig.ENCHANTS.ENCHANT_ON_SPAWN_EXCLUSION_ENCHANTMENTS.get().contains(mobEnchantment.getRegistryName().toString());
    }

}
