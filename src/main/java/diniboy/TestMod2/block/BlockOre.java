package diniboy.TestMod2.block;

import diniboy.TestMod2.TestMod2;
import diniboy.TestMod2.item.ItemOreDict;
import diniboy.TestMod2.proxy.ClientProxy;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOre extends BlockBase implements ItemOreDict {
	
	private String oreName;

	public BlockOre(String name, String oreName) {
		super(Material.ROCK, name);
		
		this.oreName = oreName;

		setHardness(3f);
		setResistance(5f);
	}
	
	@Override
	public void initOreDict() {
		OreDictionary.registerOre(oreName, this);
	}

	@Override
	public BlockOre setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ClientProxy.creativeTab);
		return this;
	}

}
