package co.jaketaylor.testmod.blocks

import co.jaketaylor.testmod.TestMod
import net.minecraftforge.fml.common.registry.GameRegistry

class ModBlocks {
  var steelBlock: BlockSteel = new BlockSteel();

  var crusherBlock: BlockCrusher = new BlockCrusher();

  def init(): Unit = {
    //
  }

  def initModels(): Unit = {
    steelBlock.initModel();
    crusherBlock.initModel();
  }
}
