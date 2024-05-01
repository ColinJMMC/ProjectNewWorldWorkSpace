package net.mcreator.projectnewworld.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.projectnewworld.ProjectnewworldMod;

import java.util.Map;

public class AmaterasuOnEffectActiveTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ProjectnewworldMod.LOGGER.warn("Failed to load dependency entity for procedure AmaterasuOnEffectActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).attackEntityFrom(new DamageSource("scorched out").setDamageBypassesArmor(), (float) 1);
		}
	}
}
