package net.mcreator.projectnewworld.procedures;

import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.projectnewworld.item.GoldenPoleV2Item;
import net.mcreator.projectnewworld.ProjectnewworldMod;

import java.util.Map;

public class GoldenPoleRightclickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ProjectnewworldMod.LOGGER.warn("Failed to load dependency entity for procedure GoldenPoleRightclicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.isSneaking()) {
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(GoldenPoleV2Item.block);
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
		}
	}
}
