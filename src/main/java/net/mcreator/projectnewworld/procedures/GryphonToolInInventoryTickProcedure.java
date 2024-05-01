package net.mcreator.projectnewworld.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.projectnewworld.ProjectnewworldModVariables;
import net.mcreator.projectnewworld.ProjectnewworldMod;

import java.util.Map;

public class GryphonToolInInventoryTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ProjectnewworldMod.LOGGER.warn("Failed to load dependency entity for procedure GryphonToolInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ProjectnewworldModVariables.PlayerVariables())).gryphoncooldown < 0) {
			{
				double _setval = ((entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ProjectnewworldModVariables.PlayerVariables())).gryphoncooldown + 1);
				entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.gryphoncooldown = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
