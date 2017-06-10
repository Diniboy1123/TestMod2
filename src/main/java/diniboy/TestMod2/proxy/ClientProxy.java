package diniboy.TestMod2.proxy;

import diniboy.TestMod2.TestMod2;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {

	/*@Override
	public void registerItemRenderer(ItemBase item, int meta, String id) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(TestMod.MODID + ":" + id, "inventory"));
		
	}
	
	@Override
	public void registerBlockRenderer(ItemBlock itemBlock, int meta, String id) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlock, meta, new ModelResourceLocation(TestMod.MODID + ":" + id, "inventory"));
	}*/
	
	public void registerRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(TestMod2.MODID + ":" + id, "inventory"));
	}
	
}
