package co.jaketaylor.testmod.blocks

import co.jaketaylor.testmod.TestMod
import net.minecraftforge.fml.common.registry.GameRegistry

class ModBlocks {
  @GameRegistry.ObjectHolder(TestMod.NAME + ":steel_block")
  var steelBlock: BlockSteel = null;

  def init(): Unit = {
    steelBlock = new BlockSteel();
  }

  def initModels(): Unit =
  {
    steelBlock.initModel();
  }
}
