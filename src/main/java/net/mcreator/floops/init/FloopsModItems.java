
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.floops.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.floops.item.SilverSwordItem;
import net.mcreator.floops.item.SilverShovelItem;
import net.mcreator.floops.item.SilverPickaxeItem;
import net.mcreator.floops.item.SilverIngotItem;
import net.mcreator.floops.item.SilverHoeItem;
import net.mcreator.floops.item.SilverAxeItem;
import net.mcreator.floops.item.SilverArmorItem;
import net.mcreator.floops.item.LaserStaffItem;
import net.mcreator.floops.item.LaserHandleItem;
import net.mcreator.floops.item.LaserCrystalItem;
import net.mcreator.floops.item.LaserBowItem;
import net.mcreator.floops.item.LaserBladeItem;
import net.mcreator.floops.FloopsMod;

public class FloopsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(FloopsMod.MODID);
	public static final DeferredItem<Item> LASER_BOW = REGISTRY.register("laser_bow", LaserBowItem::new);
	public static final DeferredItem<Item> LASER_BLADE = REGISTRY.register("laser_blade", LaserBladeItem::new);
	public static final DeferredItem<Item> LASER_CRYSTAL = REGISTRY.register("laser_crystal", LaserCrystalItem::new);
	public static final DeferredItem<Item> LASER_HANDLE = REGISTRY.register("laser_handle", LaserHandleItem::new);
	public static final DeferredItem<Item> LASER_SOLDIER_SPAWN_EGG = REGISTRY.register("laser_soldier_spawn_egg", () -> new DeferredSpawnEggItem(FloopsModEntities.LASER_SOLDIER, -16776961, -10066330, new Item.Properties()));
	public static final DeferredItem<Item> LASERSCORPION_SPAWN_EGG = REGISTRY.register("laserscorpion_spawn_egg", () -> new DeferredSpawnEggItem(FloopsModEntities.LASERSCORPION, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", SilverIngotItem::new);
	public static final DeferredItem<Item> SILVER_ORE = block(FloopsModBlocks.SILVER_ORE);
	public static final DeferredItem<Item> SILVER_BLOCK = block(FloopsModBlocks.SILVER_BLOCK);
	public static final DeferredItem<Item> SILVER_PICKAXE = REGISTRY.register("silver_pickaxe", SilverPickaxeItem::new);
	public static final DeferredItem<Item> SILVER_AXE = REGISTRY.register("silver_axe", SilverAxeItem::new);
	public static final DeferredItem<Item> SILVER_SWORD = REGISTRY.register("silver_sword", SilverSwordItem::new);
	public static final DeferredItem<Item> SILVER_SHOVEL = REGISTRY.register("silver_shovel", SilverShovelItem::new);
	public static final DeferredItem<Item> SILVER_HOE = REGISTRY.register("silver_hoe", SilverHoeItem::new);
	public static final DeferredItem<Item> SILVER_ARMOR_HELMET = REGISTRY.register("silver_armor_helmet", SilverArmorItem.Helmet::new);
	public static final DeferredItem<Item> SILVER_ARMOR_CHESTPLATE = REGISTRY.register("silver_armor_chestplate", SilverArmorItem.Chestplate::new);
	public static final DeferredItem<Item> SILVER_ARMOR_LEGGINGS = REGISTRY.register("silver_armor_leggings", SilverArmorItem.Leggings::new);
	public static final DeferredItem<Item> SILVER_ARMOR_BOOTS = REGISTRY.register("silver_armor_boots", SilverArmorItem.Boots::new);
	public static final DeferredItem<Item> LASER_STAFF = REGISTRY.register("laser_staff", LaserStaffItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
