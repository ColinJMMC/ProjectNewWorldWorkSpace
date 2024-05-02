package net.mcreator.projectnewworld.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.projectnewworld.item.UssopSlingshotItem;
import net.mcreator.projectnewworld.item.TntPalletItem;
import net.mcreator.projectnewworld.item.LightrayItem;
import net.mcreator.projectnewworld.item.LightSwordItem;
import net.mcreator.projectnewworld.item.GryphonbarrageItem;
import net.mcreator.projectnewworld.item.Gryphonbarrage1Item;
import net.mcreator.projectnewworld.item.GryphonItem;
import net.mcreator.projectnewworld.ProjectnewworldModVariables;
import net.mcreator.projectnewworld.ProjectnewworldMod;

import java.util.Map;

public class Move1OnKeyPressedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ProjectnewworldMod.LOGGER.warn("Failed to load dependency world for procedure Move1OnKeyPressed!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ProjectnewworldMod.LOGGER.warn("Failed to load dependency entity for procedure Move1OnKeyPressed!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == UssopSlingshotItem.block) {
			if ((entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ProjectnewworldModVariables.PlayerVariables())).move1cd >= 0) {
				{
					Entity _shootFrom = entity;
					World projectileLevel = _shootFrom.world;
					if (!projectileLevel.isRemote()) {
						ProjectileEntity _entityToSpawn = new Object() {
							public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback, byte piercing) {
								AbstractArrowEntity entityToSpawn = new TntPalletItem.ArrowCustomEntity(TntPalletItem.arrow, world);
								entityToSpawn.setShooter(shooter);
								entityToSpawn.setDamage(damage);
								entityToSpawn.setKnockbackStrength(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);

								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 5, 1, (byte) 5);
						_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
						_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 2, 0);
						projectileLevel.addEntity(_entityToSpawn);
					}
				}
				{
					double _setval = (-120);
					entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.move1cd = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == LightSwordItem.block) {
			if ((entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ProjectnewworldModVariables.PlayerVariables())).move1cd >= 0) {
				{
					Entity _shootFrom = entity;
					World projectileLevel = _shootFrom.world;
					if (!projectileLevel.isRemote()) {
						ProjectileEntity _entityToSpawn = new Object() {
							public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback, byte piercing) {
								AbstractArrowEntity entityToSpawn = new LightrayItem.ArrowCustomEntity(LightrayItem.arrow, world);
								entityToSpawn.setShooter(shooter);
								entityToSpawn.setDamage(damage);
								entityToSpawn.setKnockbackStrength(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);

								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 5, 1, (byte) 5);
						_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
						_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 5, 0);
						projectileLevel.addEntity(_entityToSpawn);
					}
				}
				{
					double _setval = (-120);
					entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.move1cd = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == GryphonItem.block) {
			if ((entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ProjectnewworldModVariables.PlayerVariables())).move1cd >= 0) {
				{
					Entity _shootFrom = entity;
					World projectileLevel = _shootFrom.world;
					if (!projectileLevel.isRemote()) {
						ProjectileEntity _entityToSpawn = new Object() {
							public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback, byte piercing) {
								AbstractArrowEntity entityToSpawn = new GryphonbarrageItem.ArrowCustomEntity(GryphonbarrageItem.arrow, world);
								entityToSpawn.setShooter(shooter);
								entityToSpawn.setDamage(damage);
								entityToSpawn.setKnockbackStrength(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);

								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 5, 1, (byte) 5);
						_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
						_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 5, 0);
						projectileLevel.addEntity(_entityToSpawn);
					}
				}
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private IWorld world;

					public void start(IWorld world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						{
							Entity _shootFrom = entity;
							World projectileLevel = _shootFrom.world;
							if (!projectileLevel.isRemote()) {
								ProjectileEntity _entityToSpawn = new Object() {
									public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback, byte piercing) {
										AbstractArrowEntity entityToSpawn = new Gryphonbarrage1Item.ArrowCustomEntity(Gryphonbarrage1Item.arrow,
												world);
										entityToSpawn.setShooter(shooter);
										entityToSpawn.setDamage(damage);
										entityToSpawn.setKnockbackStrength(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.setPierceLevel(piercing);

										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 5, 1, (byte) 5);
								_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
								_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 5, 0);
								projectileLevel.addEntity(_entityToSpawn);
							}
						}
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private IWorld world;

							public void start(IWorld world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								{
									Entity _shootFrom = entity;
									World projectileLevel = _shootFrom.world;
									if (!projectileLevel.isRemote()) {
										ProjectileEntity _entityToSpawn = new Object() {
											public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback,
													byte piercing) {
												AbstractArrowEntity entityToSpawn = new GryphonbarrageItem.ArrowCustomEntity(GryphonbarrageItem.arrow,
														world);
												entityToSpawn.setShooter(shooter);
												entityToSpawn.setDamage(damage);
												entityToSpawn.setKnockbackStrength(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.setPierceLevel(piercing);

												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 5, 1, (byte) 5);
										_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
										_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 5, 0);
										projectileLevel.addEntity(_entityToSpawn);
									}
								}
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private IWorld world;

									public void start(IWorld world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										{
											Entity _shootFrom = entity;
											World projectileLevel = _shootFrom.world;
											if (!projectileLevel.isRemote()) {
												ProjectileEntity _entityToSpawn = new Object() {
													public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback,
															byte piercing) {
														AbstractArrowEntity entityToSpawn = new Gryphonbarrage1Item.ArrowCustomEntity(
																Gryphonbarrage1Item.arrow, world);
														entityToSpawn.setShooter(shooter);
														entityToSpawn.setDamage(damage);
														entityToSpawn.setKnockbackStrength(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.setPierceLevel(piercing);

														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 5, 1, (byte) 5);
												_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
												_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z,
														5, 0);
												projectileLevel.addEntity(_entityToSpawn);
											}
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 5);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 5);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 5);
				{
					double _setval = (-60);
					entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.move1cd = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
