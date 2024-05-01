
package net.mcreator.projectnewworld.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.projectnewworld.item.LazerArmItem;
import net.mcreator.projectnewworld.ProjectnewworldModElements;

@ProjectnewworldModElements.ModElement.Tag
public class PNWArmorItemGroup extends ProjectnewworldModElements.ModElement {
	public PNWArmorItemGroup(ProjectnewworldModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabpnw_armor") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LazerArmItem.body);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
