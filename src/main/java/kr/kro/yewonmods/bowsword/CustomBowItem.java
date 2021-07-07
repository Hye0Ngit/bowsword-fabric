package kr.kro.yewonmods.bowsword;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CustomBowItem extends BowItem {
    public CustomBowItem(Settings settings) {
        super(settings);
    }

    public CustomBowItem(Wood instance, int i, float v, Settings group) {
        super(group);
    }
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!player.isSneaking()) {
            player.sendMessage(new LiteralText("Sneak right click (switching to sword mode) function doesn't work now. Put your bow on crafting and it will switch to a sword."), false);
        }

        return ActionResult.SUCCESS;
    }
}
