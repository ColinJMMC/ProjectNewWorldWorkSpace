
package net.mcreator.projectnewworld.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.projectnewworld.procedures.Move1tickProcedure;
import net.mcreator.projectnewworld.itemgroup.PNWItemsItemGroup;
import net.mcreator.projectnewworld.ProjectnewworldModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

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
			super(new Item.Properties().group(PNWItemsItemGroup.tab).maxStackSize(16).rarity(Rarity.COMMON));
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

		@Override
		public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();

			Move1tickProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
					(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
		}
	}
}
