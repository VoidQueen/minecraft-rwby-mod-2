
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newminecrafttest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.newminecrafttest.NewMinecraftTestMod;

public class NewMinecraftTestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NewMinecraftTestMod.MODID);
	public static final RegistryObject<Item> YOUR_MOM_WOOD = block(NewMinecraftTestModBlocks.YOUR_MOM_WOOD);
	public static final RegistryObject<Item> YOUR_MOM_LOG = block(NewMinecraftTestModBlocks.YOUR_MOM_LOG);
	public static final RegistryObject<Item> YOUR_MOM_PLANKS = block(NewMinecraftTestModBlocks.YOUR_MOM_PLANKS);
	public static final RegistryObject<Item> YOUR_MOM_LEAVES = block(NewMinecraftTestModBlocks.YOUR_MOM_LEAVES);
	public static final RegistryObject<Item> YOUR_MOM_STAIRS = block(NewMinecraftTestModBlocks.YOUR_MOM_STAIRS);
	public static final RegistryObject<Item> YOUR_MOM_SLAB = block(NewMinecraftTestModBlocks.YOUR_MOM_SLAB);
	public static final RegistryObject<Item> YOUR_MOM_FENCE = block(NewMinecraftTestModBlocks.YOUR_MOM_FENCE);
	public static final RegistryObject<Item> YOUR_MOM_FENCE_GATE = block(NewMinecraftTestModBlocks.YOUR_MOM_FENCE_GATE);
	public static final RegistryObject<Item> YOUR_MOM_PRESSURE_PLATE = block(NewMinecraftTestModBlocks.YOUR_MOM_PRESSURE_PLATE);
	public static final RegistryObject<Item> YOUR_MOM_BUTTON = block(NewMinecraftTestModBlocks.YOUR_MOM_BUTTON);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
