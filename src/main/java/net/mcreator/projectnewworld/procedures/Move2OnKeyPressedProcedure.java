package net.mcreator.projectnewworld.procedures;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import net.mcreator.projectnewworld.item.UssopSlingshotItem;
import net.mcreator.projectnewworld.item.TpLightRayItem;
import net.mcreator.projectnewworld.item.LightSwordItem;
import net.mcreator.projectnewworld.item.GryphonItem;
import net.mcreator.projectnewworld.item.GiantslashItem;
import net.mcreator.projectnewworld.ProjectnewworldModVariables;
import net.mcreator.projectnewworld.ProjectnewworldMod;

import java.util.Map;

public class Move2OnKeyPressedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ProjectnewworldMod.LOGGER.warn("Failed to load dependency entity for procedure Move2OnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == UssopSlingshotItem.block) {
			if ((entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ProjectnewworldModVariables.PlayerVariables())).move2cd >= 0) {
				{
					Entity _shootFrom = entity;
					World projectileLevel = _shootFrom.world;
					if (!projectileLevel.isRemote()) {
						ProjectileEntity _entityToSpawn = new Object() {
							public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback) {
								AbstractArrowEntity entityToSpawn = new ArrowEntity(EntityType.ARROW, world);
								entityToSpawn.setShooter(shooter);
								entityToSpawn.setDamage(damage);
								entityToSpawn.setKnockbackStrength(knockback);

								entityToSpawn.setFire(100);

								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 5, 1);
						_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
						_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 2, 0);
						projectileLevel.addEntity(_entityToSpawn);
					}
				}
				{
					double _setval = (-60);
					entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.move2cd = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == LightSwordItem.block) {
			if ((entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ProjectnewworldModVariables.PlayerVariables())).move2cd >= 0) {
				{
					Entity _shootFrom = entity;
					World projectileLevel = _shootFrom.world;
					if (!projectileLevel.isRemote()) {
						ProjectileEntity _entityToSpawn = new Object() {
							public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback, byte piercing) {
								AbstractArrowEntity entityToSpawn = new TpLightRayItem.ArrowCustomEntity(TpLightRayItem.arrow, world);
								entityToSpawn.setShooter(shooter);
								entityToSpawn.setDamage(damage);
								entityToSpawn.setKnockbackStrength(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);

								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 0, 1, (byte) 5);
						_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
						_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 8, 0);
						projectileLevel.addEntity(_entityToSpawn);
					}
				}
				{
					double _setval = (-60);
					entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.move2cd = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == GryphonItem.block) {
			if ((entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ProjectnewworldModVariables.PlayerVariables())).move2cd >= 0) {
				{
					Entity _shootFrom = entity;
					World projectileLevel = _shootFrom.world;
					if (!projectileLevel.isRemote()) {
						ProjectileEntity _entityToSpawn = new Object() {
							public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback, byte piercing) {
								AbstractArrowEntity entityToSpawn = new GiantslashItem.ArrowCustomEntity(GiantslashItem.arrow, world);
								entityToSpawn.setShooter(shooter);
								entityToSpawn.setDamage(damage);
								entityToSpawn.setKnockbackStrength(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);

								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 15, 1, (byte) 1);
						_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
						_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 4, 0);
						projectileLevel.addEntity(_entityToSpawn);
					}
				}
				{
					double _setval = (-240);
					entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.move2cd = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
