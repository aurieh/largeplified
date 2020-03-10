package me.aurieh.largeplified.mixin;

import net.minecraft.world.biome.layer.BiomeLayers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(BiomeLayers.class)
public class BiomeLayersMixin {
    @ModifyVariable(method = "build", name = "i", at = @At("STORE"))
    private static int onBuildAdjustVar_i(int i) {
        return 6;
    }
}
