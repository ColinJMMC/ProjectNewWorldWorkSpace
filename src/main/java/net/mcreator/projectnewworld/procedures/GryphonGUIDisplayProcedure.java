package net.mcreator.projectnewworld.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.projectnewworld.item.GryphonItem;
import net.mcreator.projectnewworld.ProjectnewworldMod;

import java.util.Map;

public class GryphonGUIDisplayProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ProjectnewworldMod.LOGGER.warn("Failed to load dependency entity for procedure GryphonGUIDisplay!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == GryphonItem.block) == true) {
			return true;
		}
		return false;
	}
}
