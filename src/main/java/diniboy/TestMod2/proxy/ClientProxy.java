package diniboy.TestMod2.proxy;

import diniboy.TestMod2.TestMod2;
import diniboy.TestMod2.tab.TestTab;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
	
	public static final TestTab creativeTab = new TestTab();
	
	public void registerRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(TestMod2.MODID + ":" + id, "inventory"));
	}
	
}
