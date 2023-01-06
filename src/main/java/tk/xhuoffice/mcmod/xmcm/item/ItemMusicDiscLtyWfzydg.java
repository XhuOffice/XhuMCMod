
package tk.xhuoffice.mcmod.xmcm.item;

import tk.xhuoffice.mcmod.xmcm.creativetab.TabXhuList;
import tk.xhuoffice.mcmod.xmcm.ElementsXhumcmodMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsXhumcmodMod.ModElement.Tag
public class ItemMusicDiscLtyWfzydg extends ElementsXhumcmodMod.ModElement {
	@GameRegistry.ObjectHolder("xhumcmod:music_disc_lty_wfzydg")
	public static final Item block = null;
	public ItemMusicDiscLtyWfzydg(ElementsXhumcmodMod instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("xhumcmod:music_disc_lty_wfzydg", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("music_disc_lty_wfzydg", ElementsXhumcmodMod.sounds.get(new ResourceLocation("xhumcmod:wfzydg")));
			setUnlocalizedName("music_disc_lty_wfzydg");
			setRegistryName("music_disc_lty_wfzydg");
			setCreativeTab(TabXhuList.tab);
		}
	}
}
