
package net.mcreator.newminecrafttest.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BooletitemItem extends Item {
	public BooletitemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
