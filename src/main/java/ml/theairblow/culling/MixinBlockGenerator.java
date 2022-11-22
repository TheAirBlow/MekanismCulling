package ml.theairblow.culling;

import mekanism.common.block.BlockMekanismContainer;
import mekanism.generators.common.block.BlockGenerator;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumBlockRenderType;
import org.spongepowered.asm.mixin.Mixin;

import javax.annotation.Nonnull;

@Mixin(BlockGenerator.class)
public abstract class MixinBlockGenerator extends BlockMekanismContainer {

    protected MixinBlockGenerator(Material materialIn) {
        super(materialIn);
    }

    @Override
    @Deprecated
    public boolean isOpaqueCube(IBlockState state) {
        return state.getBlock().getMetaFromState(state) >= 7;
    }

    @Override
    @Deprecated
    public boolean isFullCube(IBlockState state) {
        return state.getBlock().getMetaFromState(state) >= 7;
    }
}
