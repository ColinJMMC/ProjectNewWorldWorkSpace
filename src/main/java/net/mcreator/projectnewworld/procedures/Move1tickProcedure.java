package net.mcreator.projectnewworld.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.projectnewworld.ProjectnewworldModVariables;
import net.mcreator.projectnewworld.ProjectnewworldMod;

import java.util.Map;

public class Move1tickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ProjectnewworldMod.LOGGER.warn("Failed to load dependency entity for procedure Move1tick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ProjectnewworldModVariables.PlayerVariables())).move1cd <= 0) {
			{
				double _setval = ((entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ProjectnewworldModVariables.PlayerVariables())).move1cd + 1);
				entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.move1cd = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ProjectnewworldModVariables.PlayerVariables())).move2cd <= 0) {
			{
				double _setval = ((entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ProjectnewworldModVariables.PlayerVariables())).move2cd + 1);
				entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.move2cd = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
