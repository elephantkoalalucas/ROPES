
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.floops.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.floops.FloopsMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class FloopsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FloopsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LT = REGISTRY.register("lt",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.floops.lt")).icon(() -> new ItemStack(FloopsModItems.LASER_CRYSTAL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FloopsModItems.LASER_STAFF.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(FloopsModBlocks.SILVER_ORE.get().asItem());
			tabData.accept(FloopsModBlocks.SILVER_BLOCK.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {

			tabData.accept(FloopsModItems.LASER_BOW.get());
			tabData.accept(FloopsModItems.SILVER_SWORD.get());
			tabData.accept(FloopsModItems.SILVER_ARMOR_HELMET.get());
			tabData.accept(FloopsModItems.SILVER_ARMOR_CHESTPLATE.get());
			tabData.accept(FloopsModItems.SILVER_ARMOR_LEGGINGS.get());
			tabData.accept(FloopsModItems.SILVER_ARMOR_BOOTS.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(FloopsModItems.LASER_SOLDIER_SPAWN_EGG.get());
			tabData.accept(FloopsModItems.LASERSCORPION_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(FloopsModItems.SILVER_INGOT.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(FloopsModItems.SILVER_PICKAXE.get());
			tabData.accept(FloopsModItems.SILVER_AXE.get());
			tabData.accept(FloopsModItems.SILVER_SHOVEL.get());
			tabData.accept(FloopsModItems.SILVER_HOE.get());

		}
	}
}
