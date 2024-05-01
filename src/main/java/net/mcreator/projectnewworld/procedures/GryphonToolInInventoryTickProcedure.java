package net.mcreator.projectnewworld.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.projectnewworld.ProjectnewworldModVariables;
import net.mcreator.projectnewworld.ProjectnewworldMod;

import java.util.Map;

public class GryphonToolInInventoryTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ProjectnewworldMod.LOGGER.warn("Failed to load dependency world for procedure GryphonToolInInventoryTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (ProjectnewworldModVariables.WorldVariables.get(world).gryphoncooldown < 0) {
			ProjectnewworldModVariables.WorldVariables
					.get(world).gryphoncooldown = (ProjectnewworldModVariables.WorldVariables.get(world).gryphoncooldown + 1);
			ProjectnewworldModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
