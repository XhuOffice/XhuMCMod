
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
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

@ElementsXhuMod.ModElement.Tag
public class ItemXhuHoe extends ElementsXhuMod.ModElement {
	@GameRegistry.ObjectHolder("xhu:xhu_hoe")
	public static final Item block = null;
	public ItemXhuHoe(ElementsXhuMod instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("XHU_HOE", 4, 114514, 9f, 0f, 29)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("xhu_hoe").setRegistryName("xhu_hoe").setCreativeTab(TabXhuList.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("xhu:xhu_hoe", "inventory"));
	}
}
