package diniboy.TestMod2.block;

import diniboy.TestMod2.TestMod2;
import diniboy.TestMod2.item.ItemModelProvider;
import diniboy.TestMod2.item.ItemOreDict;
import diniboy.TestMod2.tab.TestTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static BlockBase oreCopper;
	public static BlockBase modcauldron;

	public static void init() {
		oreCopper = register(new BlockOre("ore_copper", "oreCopper").setCreativeTab(CreativeTabs.MATERIALS));
		modcauldron = register(new ModCauldron());
	}

	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		if (itemBlock != null) {
			GameRegistry.register(itemBlock);


			if (block instanceof ItemModelProvider) {
				((ItemModelProvider)block).registerItemModel(itemBlock);
			}
			if (block instanceof ItemOreDict) {
				((ItemOreDict)block).initOreDict();
			}
			if (itemBlock instanceof ItemOreDict) {
				((ItemOreDict)itemBlock).initOreDict();
			}
		}
		return block;
	}

	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}

}
