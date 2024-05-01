
package net.mcreator.projectnewworld.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.projectnewworld.itemgroup.PNWWeaponsItemGroup;
import net.mcreator.projectnewworld.ProjectnewworldModElements;

@ProjectnewworldModElements.ModElement.Tag
public class LightSwordItem extends ProjectnewworldModElements.ModElement {
	@ObjectHolder("projectnewworld:light_sword")
	public static final Item block = null;

	public LightSwordItem(ProjectnewworldModElements instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 500;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 18f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.GLOWSTONE_DUST));
			}
		}, 3, -2f, new Item.Properties().group(PNWWeaponsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("light_sword"));
	}
}
