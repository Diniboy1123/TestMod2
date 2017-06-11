package diniboy.TestMod2.item;

import diniboy.TestMod2.TestMod2;
import diniboy.TestMod2.proxy.ClientProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemBase ingotCopper;
	
	public static void init() {
		ingotCopper = register(new ItemOre("ingot_copper", "ingotCopper").setCreativeTab(ClientProxy.creativeTab));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}
		
		if (item instanceof ItemOreDict) {
			((ItemOreDict)item).initOreDict();
		}

		return item;
	}
	
}
