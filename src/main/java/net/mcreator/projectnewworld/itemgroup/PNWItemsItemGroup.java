
package net.mcreator.projectnewworld.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.projectnewworld.item.PopgreenItem;
import net.mcreator.projectnewworld.ProjectnewworldModElements;

@ProjectnewworldModElements.ModElement.Tag
public class PNWItemsItemGroup extends ProjectnewworldModElements.ModElement {
	public PNWItemsItemGroup(ProjectnewworldModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabpnw_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PopgreenItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
