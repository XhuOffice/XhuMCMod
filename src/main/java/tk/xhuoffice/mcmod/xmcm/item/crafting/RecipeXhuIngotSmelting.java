
package tk.xhuoffice.mcmod.xmcm.item.crafting;

import tk.xhuoffice.mcmod.xmcm.item.ItemXhuIngot;
import tk.xhuoffice.mcmod.xmcm.block.BlockXhuOre;
import tk.xhuoffice.mcmod.xmcm.ElementsXhumcmodMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsXhumcmodMod.ModElement.Tag
public class RecipeXhuIngotSmelting extends ElementsXhumcmodMod.ModElement {
	public RecipeXhuIngotSmelting(ElementsXhumcmodMod instance) {
		super(instance, 14);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockXhuOre.block, (int) (1)), new ItemStack(ItemXhuIngot.block, (int) (1)), 1F);
	}
}
