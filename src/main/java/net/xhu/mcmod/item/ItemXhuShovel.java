
package net.xhu.mcmod.item;

import net.xhu.mcmod.creativetab.TabXhuList;
import net.xhu.mcmod.ElementsXhuMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

@ElementsXhuMod.ModElement.Tag
public class ItemXhuShovel extends ElementsXhuMod.ModElement {
	@GameRegistry.ObjectHolder("xhu:xhu_shovel")
	public static final Item block = null;
	public ItemXhuShovel(ElementsXhuMod instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("XHU_SHOVEL", 4, 114514, 9f, 0f, 29)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("xhu_shovel").setRegistryName("xhu_shovel").setCreativeTab(TabXhuList.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("xhu:xhu_shovel", "inventory"));
	}
}
