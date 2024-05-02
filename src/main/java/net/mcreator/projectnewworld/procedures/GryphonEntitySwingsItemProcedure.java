package net.mcreator.projectnewworld.procedures;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.projectnewworld.item.SlashItem;
import net.mcreator.projectnewworld.item.SkepslashItem;
import net.mcreator.projectnewworld.item.SkepKatanaItem;
import net.mcreator.projectnewworld.item.GryphonItem;
import net.mcreator.projectnewworld.item.BeeSlashItem;
import net.mcreator.projectnewworld.item.BeeKatanaItem;
import net.mcreator.projectnewworld.ProjectnewworldModVariables;
import net.mcreator.projectnewworld.ProjectnewworldMod;

import java.util.Map;

public class GryphonEntitySwingsItemProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ProjectnewworldMod.LOGGER.warn("Failed to load dependency entity for procedure GryphonEntitySwingsItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == GryphonItem.block) {
			if ((entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ProjectnewworldModVariables.PlayerVariables())).gryphoncooldown >= 0) {
				{
					Entity _shootFrom = entity;
					World projectileLevel = _shootFrom.world;
					if (!projectileLevel.isRemote()) {
						ProjectileEntity _entityToSpawn = new Object() {
							public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback) {
								AbstractArrowEntity entityToSpawn = new SlashItem.ArrowCustomEntity(SlashItem.arrow, world);
								entityToSpawn.setShooter(shooter);
								entityToSpawn.setDamage(damage);
								entityToSpawn.setKnockbackStrength(knockback);
								entityToSpawn.setSilent(true);

								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 5, 1);
						_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
						_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 5, 0);
						projectileLevel.addEntity(_entityToSpawn);
					}
				}
				{
					double _setval = (-60);
					entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.gryphoncooldown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == BeeKatanaItem.block) {
			if ((entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ProjectnewworldModVariables.PlayerVariables())).gryphoncooldown >= 0) {
				{
					Entity _shootFrom = entity;
					World projectileLevel = _shootFrom.world;
					if (!projectileLevel.isRemote()) {
						ProjectileEntity _entityToSpawn = new Object() {
							public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback) {
								AbstractArrowEntity entityToSpawn = new BeeSlashItem.ArrowCustomEntity(BeeSlashItem.arrow, world);
								entityToSpawn.setShooter(shooter);
								entityToSpawn.setDamage(damage);
								entityToSpawn.setKnockbackStrength(knockback);
								entityToSpawn.setSilent(true);

								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 5, 1);
						_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
						_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 5, 0);
						projectileLevel.addEntity(_entityToSpawn);
					}
				}
				{
					double _setval = (-60);
					entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.gryphoncooldown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == SkepKatanaItem.block) {
			if ((entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ProjectnewworldModVariables.PlayerVariables())).gryphoncooldown >= 0) {
				{
					Entity _shootFrom = entity;
					World projectileLevel = _shootFrom.world;
					if (!projectileLevel.isRemote()) {
						ProjectileEntity _entityToSpawn = new Object() {
							public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback) {
								AbstractArrowEntity entityToSpawn = new SkepslashItem.ArrowCustomEntity(SkepslashItem.arrow, world);
								entityToSpawn.setShooter(shooter);
								entityToSpawn.setDamage(damage);
								entityToSpawn.setKnockbackStrength(knockback);
								entityToSpawn.setSilent(true);

								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 5, 1);
						_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
						_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 5, 0);
						projectileLevel.addEntity(_entityToSpawn);
					}
				}
				{
					double _setval = (-60);
					entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.gryphoncooldown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
