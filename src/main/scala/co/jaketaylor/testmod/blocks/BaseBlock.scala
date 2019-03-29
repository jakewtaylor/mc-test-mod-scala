package co.jaketaylor.testmod.blocks

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.Item
import net.minecraft.item.ItemBlock
import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.fml.common.registry.GameRegistry

class BaseBlock(material: Material, name: String) extends Block(material) {
  setRegistryName(name);
  setUnlocalizedName(name)

  register(createItem)

  def register(item: Item): Unit = {
    // Register the instance as a block
    GameRegistry.findRegistry(classOf[Block]).register(this);

    // Register the instance as an item too
    GameRegistry.findRegistry(classOf[Item]).register(item);
  }

  def createItem: Item = new ItemBlock(this).setRegistryName(getRegistryName());

  def initModel(): Unit = {
    ModelLoader.setCustomModelResourceLocation(
      Item.getItemFromBlock(this),
      0,
      new ModelResourceLocation(getRegistryName().toString(), "inventory")
    );
  }
}
