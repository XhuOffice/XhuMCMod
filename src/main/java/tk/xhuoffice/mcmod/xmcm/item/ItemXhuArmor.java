
package tk.xhuoffice.mcmod.xmcm.item;

import tk.xhuoffice.mcmod.xmcm.creativetab.TabXhuList;
import tk.xhuoffice.mcmod.xmcm.ElementsXhumcmodMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsXhumcmodMod.ModElement.Tag
public class ItemXhuArmor extends ElementsXhumcmodMod.ModElement {
	@GameRegistry.ObjectHolder("xhumcmod:xhu_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("xhumcmod:xhu_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("xhumcmod:xhu_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("xhumcmod:xhu_armorboots")
	public static final Item boots = null;
	public ItemXhuArmor(ElementsXhumcmodMod instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("XHU_ARMOR", "xhumcmod:xhu", 32, new int[]{4, 13, 11, 4}, 19,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_diamond")),
				0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("xhu_armorhelmet")
				.setRegistryName("xhu_armorhelmet").setCreativeTab(TabXhuList.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("xhu_armorbody")
				.setRegistryName("xhu_armorbody").setCreativeTab(TabXhuList.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("xhu_armorlegs")
				.setRegistryName("xhu_armorlegs").setCreativeTab(TabXhuList.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("xhu_armorboots")
				.setRegistryName("xhu_armorboots").setCreativeTab(TabXhuList.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("xhumcmod:xhu_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("xhumcmod:xhu_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("xhumcmod:xhu_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("xhumcmod:xhu_armorboots", "inventory"));
	}
}
