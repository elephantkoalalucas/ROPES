
package net.mcreator.floops.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class Item2Item extends Item {
	public Item2Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
