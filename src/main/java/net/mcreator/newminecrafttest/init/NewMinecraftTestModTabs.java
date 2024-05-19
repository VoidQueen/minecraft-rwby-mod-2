
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newminecrafttest.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.newminecrafttest.NewMinecraftTestMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NewMinecraftTestModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NewMinecraftTestMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(NewMinecraftTestModBlocks.YOUR_MOM_LOG.get().asItem());
			tabData.accept(NewMinecraftTestModBlocks.YOUR_MOM_WOOD.get().asItem());
			tabData.accept(NewMinecraftTestModBlocks.YOUR_MOM_PLANKS.get().asItem());
			tabData.accept(NewMinecraftTestModBlocks.YOUR_MOM_STAIRS.get().asItem());
			tabData.accept(NewMinecraftTestModBlocks.YOUR_MOM_SLAB.get().asItem());
			tabData.accept(NewMinecraftTestModBlocks.YOUR_MOM_FENCE.get().asItem());
			tabData.accept(NewMinecraftTestModBlocks.YOUR_MOM_FENCE_GATE.get().asItem());
			tabData.accept(NewMinecraftTestModBlocks.YOUR_MOM_PRESSURE_PLATE.get().asItem());
			tabData.accept(NewMinecraftTestModBlocks.YOUR_MOM_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(NewMinecraftTestModBlocks.YOUR_MOM_LEAVES.get().asItem());
		}
	}
}
