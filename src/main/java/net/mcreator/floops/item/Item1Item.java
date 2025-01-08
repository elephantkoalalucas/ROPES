
package net.mcreator.floops.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class Item1Item extends Item {
	public Item1Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
