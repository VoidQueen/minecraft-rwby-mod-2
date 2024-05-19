
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newminecrafttest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.newminecrafttest.item.CRItem;
import net.mcreator.newminecrafttest.NewMinecraftTestMod;

public class NewMinecraftTestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NewMinecraftTestMod.MODID);
	public static final RegistryObject<Item> CR = REGISTRY.register("cr", () -> new CRItem());
	// Start of user code block custom items
	// End of user code block custom items
}
