package net.mcreator.projectnewworld.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.projectnewworld.ProjectnewworldModVariables;
import net.mcreator.projectnewworld.ProjectnewworldMod;

import java.util.Map;

public class KabutoDisplayMove2CDProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ProjectnewworldMod.LOGGER.warn("Failed to load dependency entity for procedure KabutoDisplayMove2CD!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(ProjectnewworldModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ProjectnewworldModVariables.PlayerVariables())).move2cd < 0) {
			return true;
		}
		return false;
	}
}
