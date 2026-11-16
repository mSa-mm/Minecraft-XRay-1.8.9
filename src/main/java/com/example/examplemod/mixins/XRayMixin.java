package com.example.examplemod.mixins;

import com.example.examplemod.KeybindHandler;
import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Block.class)
public class XRayMixin {

    @Inject(method = "shouldSideBeRendered", at = @At("HEAD"), cancellable = true)
    private void onShouldSideBeRendered(IBlockAccess worldIn, BlockPos pos, EnumFacing side, CallbackInfoReturnable<Boolean> cir) {
        // Check the boolean from our new KeybindHandler class
        if (KeybindHandler.isXRayEnabled) {
            Block block = (Block) (Object) this;
            String blockName = block.getRegistryName().toString();

            if (blockName.contains("ore") || blockName.contains("diamond") || blockName.contains("emerald") || blockName.contains("chest")) {
                return;
            }
            cir.setReturnValue(false);
        }
    }
}
