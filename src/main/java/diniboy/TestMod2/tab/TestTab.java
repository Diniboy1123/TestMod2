package diniboy.TestMod2.tab;

import diniboy.TestMod2.TestMod2;
import diniboy.TestMod2.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TestTab extends CreativeTabs {
	
	public TestTab() {
		super("TestMod");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.ingotCopper);
	}

}
