package net.mcreator.projectnewworld.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.projectnewworld.item.LightSwordItem;
import net.mcreator.projectnewworld.ProjectnewworldMod;

import java.util.Map;

public class LightSwordDisplayInGameProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ProjectnewworldMod.LOGGER.warn("Failed to load dependency entity for procedure LightSwordDisplayInGame!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == LightSwordItem.block) == true) {
			return true;
		}
		return false;
	}
}
