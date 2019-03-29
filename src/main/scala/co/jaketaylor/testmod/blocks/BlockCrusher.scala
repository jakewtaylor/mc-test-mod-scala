package co.jaketaylor.testmod.blocks

import net.minecraft.block.material.Material
import net.minecraft.block.properties.PropertyDirection
import net.minecraft.block.state.IBlockState
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.entity.EntityLivingBase
import net.minecraft.item.ItemStack
import net.minecraft.util.EnumFacing
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

class BlockCrusher extends BaseBlock(Material.IRON, "crusher_block")
{
//  val FACING: PropertyDirection = PropertyDirection.create("facing");

  setCreativeTab(CreativeTabs.DECORATIONS);
  setHarvestLevel("pickaxe", 1);

//  setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH))

//  override def getStateForPlacement(worldIn: World, pos: BlockPos, facing: EnumFacing, hitX: Float, hitY: Float, hitZ: Float, meta: Int, placer: EntityLivingBase): IBlockState = {
//    getDefaultState().withProperty(FACING, EnumFacing.getDirectionFromEntityLiving(pos, placer)).withProperty(TRIGGERED, Boolean.valueOf(false));
//  }
}
