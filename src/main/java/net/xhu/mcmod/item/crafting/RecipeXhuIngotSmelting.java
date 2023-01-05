
package net.xhu.mcmod.item.crafting;

import net.xhu.mcmod.item.ItemXhuIngot;
import net.xhu.mcmod.block.BlockXhuOre;
import net.xhu.mcmod.ElementsXhuMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsXhuMod.ModElement.Tag
public class RecipeXhuIngotSmelting extends ElementsXhuMod.ModElement {
	public RecipeXhuIngotSmelting(ElementsXhuMod instance) {
		super(instance, 14);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockXhuOre.block, (int) (1)), new ItemStack(ItemXhuIngot.block, (int) (1)), 1F);
	}
}
