
package net.mcreator.projectnewworld.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.projectnewworld.ProjectnewworldModElements;

@ProjectnewworldModElements.ModElement.Tag
public class PopgreenItem extends ProjectnewworldModElements.ModElement {
	@ObjectHolder("projectnewworld:popgreen")
	public static final Item block = null;

	public PopgreenItem(ProjectnewworldModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(16).rarity(Rarity.COMMON));
			setRegistryName("popgreen");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
