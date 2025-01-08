
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.floops.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.floops.block.SilverOreBlock;
import net.mcreator.floops.block.SilverBlockBlock;
import net.mcreator.floops.FloopsMod;

public class FloopsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(FloopsMod.MODID);
	public static final DeferredBlock<Block> SILVER_ORE = REGISTRY.register("silver_ore", SilverOreBlock::new);
	public static final DeferredBlock<Block> SILVER_BLOCK = REGISTRY.register("silver_block", SilverBlockBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
