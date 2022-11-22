package ml.theairblow.culling;

import mekanism.generators.common.GeneratorsBlocks;
import mekanism.generators.common.block.BlockReactor;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BlockReactor.class)
public abstract class MixinBlockReactor extends Block implements ITileEntityProvider {

    public MixinBlockReactor(Material blockMaterialIn, MapColor blockMapColorIn) {
        super(blockMaterialIn, blockMapColorIn);
    }

    @Override
    @Deprecated
    public boolean isOpaqueCube(IBlockState state) {
        return this == GeneratorsBlocks.Reactor;
    }

    @Override
    @Deprecated
    public boolean isFullCube(IBlockState state) {
        return this == GeneratorsBlocks.Reactor;
    }
}
