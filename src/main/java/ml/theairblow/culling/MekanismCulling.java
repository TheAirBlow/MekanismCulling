package ml.theairblow.culling;

import net.minecraftforge.fml.common.Mod;
import zone.rong.mixinbooter.ILateMixinLoader;
import java.util.Arrays;
import java.util.List;

@Mod(
        modid = MekanismCulling.MOD_ID,
        name = MekanismCulling.MOD_NAME,
        version = MekanismCulling.VERSION
)
public class MekanismCulling implements ILateMixinLoader {

    public static final String MOD_ID = "mekanism-culling";
    public static final String MOD_NAME = "Mekanism Culling";
    public static final String VERSION = "1.0.0";

    @Override
    public List<String> getMixinConfigs() {
        return Arrays.asList("mixins.json");
    }
}
