package diniboy.TestMod2;

import diniboy.TestMod2.block.ModBlocks;
import diniboy.TestMod2.item.ModItems;
import diniboy.TestMod2.proxy.CommonProxy;
import diniboy.TestMod2.recipe.ModRecipes;
import diniboy.TestMod2.tab.TestTab;
import diniboy.TestMod2.world.ModWorldGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = TestMod2.MODID, name = TestMod2.MODNAME, version = TestMod2.VERSION)
public class TestMod2 {
    public static final String MODID = "dtm";
    public static final String MODNAME = "Testing mod2";
    public static final String VERSION = "0.7.0a";
    
    @Mod.Instance
    public static TestMod2 instance;
    
    @SidedProxy(serverSide = "diniboy.TestMod2.proxy.CommonProxy", clientSide = "diniboy.TestMod2.proxy.ClientProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(MODNAME + " is loading!");
        ModItems.init();
        ModBlocks.init();
        
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	ModRecipes.init();
    }
}
