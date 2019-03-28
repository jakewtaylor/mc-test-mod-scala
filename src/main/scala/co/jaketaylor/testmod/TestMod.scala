package co.jaketaylor.testmod

import co.jaketaylor.testmod.proxy.CommonProxy
import net.minecraftforge.fml.common.SidedProxy
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPreInitializationEvent}
import org.apache.logging.log4j.Logger

@Mod(modid = TestMod.MODID, version = TestMod.VERSION, name = TestMod.NAME, modLanguage = "scala")
object TestMod {
  final val NAME = "Test Mod";
  final val MODID = "testmod";
  final val VERSION = "1.0.0";

  @SidedProxy(clientSide = "co.jaketaylor.testmod.proxy.ClientProxy", serverSide = "co.jaketaylor.testmod.proxy.ServerProxy")
  var proxy: CommonProxy = null;

  @Mod.Instance
  var instance: this.type = null;

  var logger: Logger = null;

  @Mod.EventHandler
  def preInit(event: FMLPreInitializationEvent): Unit = {
    logger = event.getModLog();
    proxy.preInit(event);
  }

  @Mod.EventHandler
  def init(event: FMLInitializationEvent): Unit = {
    println(s"TestMod booted!");
  }
}
