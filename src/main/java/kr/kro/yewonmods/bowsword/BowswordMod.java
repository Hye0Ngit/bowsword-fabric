package kr.kro.yewonmods.bowsword;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BowswordMod implements ModInitializer {
	public static final ItemGroup BOWS = FabricItemGroupBuilder.build(
			new Identifier("bowsword", "bows"),
			() -> new ItemStack(Items.BOW));

	public static final ItemGroup SWORDS = FabricItemGroupBuilder.build(
			new Identifier("bowsword", "swords"),
			() -> new ItemStack(Items.NETHERITE_SWORD));

	public static ToolItem WOODEN_SWORD = new CustomSwordItem(Wood.INSTANCE, 0, 1.6F, new Item.Settings().group(SWORDS));
	public static CustomBowItem WOODEN_BOW = new CustomBowItem(Wood.INSTANCE, 0, 1.6F, new Item.Settings().group(BOWS));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("bowsword", "wooden_sword"), WOODEN_SWORD);
		Registry.register(Registry.ITEM, new Identifier("bowsword", "wooden_bow"), WOODEN_BOW);
	}
}
