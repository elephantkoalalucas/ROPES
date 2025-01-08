
package net.mcreator.floops.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LaserHandleItem extends Item {
	public LaserHandleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
