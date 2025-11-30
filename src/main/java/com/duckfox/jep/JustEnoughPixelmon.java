package com.duckfox.jep;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = JustEnoughPixelmon.MODID, name = JustEnoughPixelmon.NAME, version = JustEnoughPixelmon.VERSION,
        dependencies = "required-after:forge@[14.23.5.2816,);after:jei@;after:pixelmon")
public class JustEnoughPixelmon {
    public static final String MODID = "jep";
    public static final String NAME = "Just Enough Pixelmon";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
