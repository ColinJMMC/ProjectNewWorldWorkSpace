
package net.mcreator.projectnewworld.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.projectnewworld.item.GoldenPoleV2Item;
import net.mcreator.projectnewworld.ProjectnewworldModElements;

@ProjectnewworldModElements.ModElement.Tag
public class PNWWeaponsItemGroup extends ProjectnewworldModElements.ModElement {
	public PNWWeaponsItemGroup(ProjectnewworldModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabpnw_weapons") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GoldenPoleV2Item.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
