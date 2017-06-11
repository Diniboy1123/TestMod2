package diniboy.TestMod2.recipe;

import diniboy.TestMod2.block.ModBlocks;
import diniboy.TestMod2.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.7f);
	}
	
}
