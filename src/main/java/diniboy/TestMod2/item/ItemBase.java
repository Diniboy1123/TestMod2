package diniboy.TestMod2.item;

import diniboy.TestMod2.TestMod2;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class ItemBase extends Item implements ItemModelProvider {
	
	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}

	@Override
	public void registerItemModel(Item item) {
		TestMod2.proxy.registerRenderer(item, 0, name);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
