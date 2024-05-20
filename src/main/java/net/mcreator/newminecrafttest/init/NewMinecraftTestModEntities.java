
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newminecrafttest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.newminecrafttest.entity.BooletEntity;
import net.mcreator.newminecrafttest.NewMinecraftTestMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NewMinecraftTestModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, NewMinecraftTestMod.MODID);
	public static final RegistryObject<EntityType<BooletEntity>> BOOLET = register("boolet",
			EntityType.Builder.<BooletEntity>of(BooletEntity::new, MobCategory.MISC).setCustomClientFactory(BooletEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
