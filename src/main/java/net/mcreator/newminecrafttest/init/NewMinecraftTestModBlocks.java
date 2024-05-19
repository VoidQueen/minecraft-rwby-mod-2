
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newminecrafttest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.newminecrafttest.block.YourMomWoodBlock;
import net.mcreator.newminecrafttest.block.YourMomStairsBlock;
import net.mcreator.newminecrafttest.block.YourMomSlabBlock;
import net.mcreator.newminecrafttest.block.YourMomPressurePlateBlock;
import net.mcreator.newminecrafttest.block.YourMomPlanksBlock;
import net.mcreator.newminecrafttest.block.YourMomLogBlock;
import net.mcreator.newminecrafttest.block.YourMomLeavesBlock;
import net.mcreator.newminecrafttest.block.YourMomFenceGateBlock;
import net.mcreator.newminecrafttest.block.YourMomFenceBlock;
import net.mcreator.newminecrafttest.block.YourMomButtonBlock;
import net.mcreator.newminecrafttest.NewMinecraftTestMod;

public class NewMinecraftTestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NewMinecraftTestMod.MODID);
	public static final RegistryObject<Block> YOUR_MOM_WOOD = REGISTRY.register("your_mom_wood", () -> new YourMomWoodBlock());
	public static final RegistryObject<Block> YOUR_MOM_LOG = REGISTRY.register("your_mom_log", () -> new YourMomLogBlock());
	public static final RegistryObject<Block> YOUR_MOM_PLANKS = REGISTRY.register("your_mom_planks", () -> new YourMomPlanksBlock());
	public static final RegistryObject<Block> YOUR_MOM_LEAVES = REGISTRY.register("your_mom_leaves", () -> new YourMomLeavesBlock());
	public static final RegistryObject<Block> YOUR_MOM_STAIRS = REGISTRY.register("your_mom_stairs", () -> new YourMomStairsBlock());
	public static final RegistryObject<Block> YOUR_MOM_SLAB = REGISTRY.register("your_mom_slab", () -> new YourMomSlabBlock());
	public static final RegistryObject<Block> YOUR_MOM_FENCE = REGISTRY.register("your_mom_fence", () -> new YourMomFenceBlock());
	public static final RegistryObject<Block> YOUR_MOM_FENCE_GATE = REGISTRY.register("your_mom_fence_gate", () -> new YourMomFenceGateBlock());
	public static final RegistryObject<Block> YOUR_MOM_PRESSURE_PLATE = REGISTRY.register("your_mom_pressure_plate", () -> new YourMomPressurePlateBlock());
	public static final RegistryObject<Block> YOUR_MOM_BUTTON = REGISTRY.register("your_mom_button", () -> new YourMomButtonBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
