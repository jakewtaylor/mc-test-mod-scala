package co.jaketaylor.testmod.proxy
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

class ClientProxy extends CommonProxy {
  override def preInit(event: FMLPreInitializationEvent): Unit = {
    super.preInit(event);

    blocks.initModels();
  }
}
