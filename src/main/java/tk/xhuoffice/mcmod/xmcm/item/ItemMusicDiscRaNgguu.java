
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
public class ItemMusicDiscRaNgguu extends ElementsXhumcmodMod.ModElement {
	@GameRegistry.ObjectHolder("xhumcmod:music_disc_ra_ngguu")
	public static final Item block = null;
	public ItemMusicDiscRaNgguu(ElementsXhumcmodMod instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("xhumcmod:music_disc_ra_ngguu", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("music_disc_ra_ngguu", ElementsXhumcmodMod.sounds.get(new ResourceLocation("xhumcmod:ngguu")));
			setUnlocalizedName("music_disc_ra_ngguu");
			setRegistryName("music_disc_ra_ngguu");
			setCreativeTab(TabXhuList.tab);
		}
	}
}
