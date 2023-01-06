
package tk.xhuoffice.mcmod.xmcm.block;

import tk.xhuoffice.mcmod.xmcm.creativetab.TabXhuList;
import tk.xhuoffice.mcmod.xmcm.ElementsXhumcmodMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

@ElementsXhumcmodMod.ModElement.Tag
public class BlockXhuBlock extends ElementsXhumcmodMod.ModElement {
	@GameRegistry.ObjectHolder("xhumcmod:xhu_block")
	public static final Block block = null;
	public BlockXhuBlock(ElementsXhumcmodMod instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("xhu_block"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("xhumcmod:xhu_block", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("xhu_block");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 3);
			setHardness(5.2F);
			setResistance(10F);
			setLightLevel(0.066666666667F);
			setLightOpacity(255);
			setCreativeTab(TabXhuList.tab);
		}

		@Override
		public PathNodeType getAiPathNodeType(IBlockState state, IBlockAccess world, BlockPos pos) {
			return PathNodeType.DANGER_CACTUS;
		}
	}
}
