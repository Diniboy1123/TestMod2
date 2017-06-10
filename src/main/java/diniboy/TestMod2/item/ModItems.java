package diniboy.TestMod2.item;

import diniboy.TestMod2.TestMod2;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemBase ingotCopper;
	
	public static void init() {
		ingotCopper = register(new ItemBase("ingot_copper").setCreativeTab(TestMod2.creativeTab));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel();
		}

		return item;
	}
	
}
