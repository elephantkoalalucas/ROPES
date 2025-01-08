
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.floops.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.floops.entity.LaserscorpionEntity;
import net.mcreator.floops.entity.LaserSoldierEntity;
import net.mcreator.floops.entity.LaserEntity;
import net.mcreator.floops.FloopsMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class FloopsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, FloopsMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<LaserEntity>> LASER = register("laser",
			EntityType.Builder.<LaserEntity>of(LaserEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<LaserSoldierEntity>> LASER_SOLDIER = register("laser_soldier",
			EntityType.Builder.<LaserSoldierEntity>of(LaserSoldierEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(50).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LaserscorpionEntity>> LASERSCORPION = register("laserscorpion",
			EntityType.Builder.<LaserscorpionEntity>of(LaserscorpionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		LaserSoldierEntity.init(event);
		LaserscorpionEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(LASER_SOLDIER.get(), LaserSoldierEntity.createAttributes().build());
		event.put(LASERSCORPION.get(), LaserscorpionEntity.createAttributes().build());
	}
}
