
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.floops.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.floops.client.renderer.LaserscorpionRenderer;
import net.mcreator.floops.client.renderer.LaserSoldierRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FloopsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FloopsModEntities.LASER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FloopsModEntities.LASER_SOLDIER.get(), LaserSoldierRenderer::new);
		event.registerEntityRenderer(FloopsModEntities.LASERSCORPION.get(), LaserscorpionRenderer::new);
	}
}
