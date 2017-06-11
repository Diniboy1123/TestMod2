package diniboy.TestMod2.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class ModCauldron extends BlockBase {

	public ModCauldron() {
		super(Material.ANVIL, "modcauldron");
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

}
