package net.mcreator.projectnewworld.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.projectnewworld.potion.AmaterasuPotionEffect;
import net.mcreator.projectnewworld.item.SasukeMSItem;
import net.mcreator.projectnewworld.ProjectnewworldMod;

import java.util.Map;

public class Jutsu1OnKeyPressedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ProjectnewworldMod.LOGGER.warn("Failed to load dependency entity for procedure Jutsu1OnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
				.getItem() == SasukeMSItem.helmet) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(AmaterasuPotionEffect.potion);
			}
		}
	}
}
