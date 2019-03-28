package co.jaketaylor.testmod.proxy

import co.jaketaylor.testmod.blocks.ModBlocks
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

class CommonProxy {
  var blocks: ModBlocks = new ModBlocks;

  def preInit(event: FMLPreInitializationEvent): Unit = {
    blocks.init();
  }
}
