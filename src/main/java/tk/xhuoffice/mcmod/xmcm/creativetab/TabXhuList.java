
package tk.xhuoffice.mcmod.xmcm.creativetab;

import tk.xhuoffice.mcmod.xmcm.item.ItemXhuLogo;
import tk.xhuoffice.mcmod.xmcm.ElementsXhumcmodMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsXhumcmodMod.ModElement.Tag
public class TabXhuList extends ElementsXhumcmodMod.ModElement {
	public TabXhuList(ElementsXhumcmodMod instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabxhu_list") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemXhuLogo.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
