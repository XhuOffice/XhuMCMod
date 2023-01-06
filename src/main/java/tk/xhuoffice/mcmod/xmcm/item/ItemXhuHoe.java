
package tk.xhuoffice.mcmod.xmcm.item;

import tk.xhuoffice.mcmod.xmcm.creativetab.TabXhuList;
import tk.xhuoffice.mcmod.xmcm.ElementsXhumcmodMod;

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

@ElementsXhumcmodMod.ModElement.Tag
public class ItemXhuHoe extends ElementsXhumcmodMod.ModElement {
	@GameRegistry.ObjectHolder("xhumcmod:xhu_hoe")
	public static final Item block = null;
	public ItemXhuHoe(ElementsXhumcmodMod instance) {
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
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("xhumcmod:xhu_hoe", "inventory"));
	}
}
