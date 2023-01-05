
package net.xhu.mcmod.item;

import net.xhu.mcmod.creativetab.TabXhuList;
import net.xhu.mcmod.ElementsXhuMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsXhuMod.ModElement.Tag
public class ItemMusicDiscLtyWfzydg extends ElementsXhuMod.ModElement {
	@GameRegistry.ObjectHolder("xhu:music_disc_lty_wfzydg")
	public static final Item block = null;
	public ItemMusicDiscLtyWfzydg(ElementsXhuMod instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("xhu:music_disc_lty_wfzydg", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("music_disc_lty_wfzydg", ElementsXhuMod.sounds.get(new ResourceLocation("xhu:wfzydg")));
			setUnlocalizedName("music_disc_lty_wfzydg");
			setRegistryName("music_disc_lty_wfzydg");
			setCreativeTab(TabXhuList.tab);
		}
	}
}
