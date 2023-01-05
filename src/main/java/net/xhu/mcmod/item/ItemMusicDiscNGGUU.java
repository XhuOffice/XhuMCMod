
package net.xhu.mcmod.item;

import net.xhu.mcmod.creativetab.TabXhuList;
import net.xhu.mcmod.ElementsXhuMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsXhuMod.ModElement.Tag
public class ItemMusicDiscNGGUU extends ElementsXhuMod.ModElement {
	@GameRegistry.ObjectHolder("xhu:music_disc_ngguu")
	public static final Item block = null;
	public ItemMusicDiscNGGUU(ElementsXhuMod instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("xhu:music_disc_ngguu", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("music_disc_ngguu", ElementsXhuMod.sounds.get(new ResourceLocation("xhu:ngguu")));
			setUnlocalizedName("music_disc_ngguu");
			setRegistryName("music_disc_ngguu");
			setCreativeTab(TabXhuList.tab);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
