
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package glitchy_mc.redstone.lamps.plus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import glitchy_mc.redstone.lamps.plus.block.YellowRedstoneLampOnBlock;
import glitchy_mc.redstone.lamps.plus.block.YellowRedstoneLampBlock;
import glitchy_mc.redstone.lamps.plus.block.WhiteRedstoneLampOnBlock;
import glitchy_mc.redstone.lamps.plus.block.WhiteRedstoneLampBlock;
import glitchy_mc.redstone.lamps.plus.block.SoulLampOnBlock;
import glitchy_mc.redstone.lamps.plus.block.SoulLampBlock;
import glitchy_mc.redstone.lamps.plus.block.RedRedstoneLampOnBlock;
import glitchy_mc.redstone.lamps.plus.block.RedRedstoneLampBlock;
import glitchy_mc.redstone.lamps.plus.block.PurpleRedstoneLampOnBlock;
import glitchy_mc.redstone.lamps.plus.block.PurpleRedstoneLampBlock;
import glitchy_mc.redstone.lamps.plus.block.PinkRedstoneLampOnBlock;
import glitchy_mc.redstone.lamps.plus.block.PinkRedstoneLampBlock;
import glitchy_mc.redstone.lamps.plus.block.OrangeRedstoneLampOnBlock;
import glitchy_mc.redstone.lamps.plus.block.OrangeRedstoneLampBlock;
import glitchy_mc.redstone.lamps.plus.block.MagentaRedstoneLampOnBlock;
import glitchy_mc.redstone.lamps.plus.block.MagentaRedstoneLampBlock;
import glitchy_mc.redstone.lamps.plus.block.LimeRedstoneLampOnBlock;
import glitchy_mc.redstone.lamps.plus.block.LimeRedstoneLampBlock;
import glitchy_mc.redstone.lamps.plus.block.LightGrayRedstoneLampOnBlock;
import glitchy_mc.redstone.lamps.plus.block.LightGrayRedstoneLampBlock;
import glitchy_mc.redstone.lamps.plus.block.LightBlueRedstoneLampOnBlock;
import glitchy_mc.redstone.lamps.plus.block.LightBlueRedstoneLampBlock;
import glitchy_mc.redstone.lamps.plus.block.GreenRedstoneLampOnBlock;
import glitchy_mc.redstone.lamps.plus.block.GreenRedstoneLampBlock;
import glitchy_mc.redstone.lamps.plus.block.GrayRedstoneLampOnBlock;
import glitchy_mc.redstone.lamps.plus.block.GrayRedstoneLampBlock;
import glitchy_mc.redstone.lamps.plus.block.EndLampOnBlock;
import glitchy_mc.redstone.lamps.plus.block.EndLampBlock;
import glitchy_mc.redstone.lamps.plus.block.CyanRedstoneLampOnBlock;
import glitchy_mc.redstone.lamps.plus.block.CyanRedstoneLampBlock;
import glitchy_mc.redstone.lamps.plus.block.BrownRedstoneLampOnBlock;
import glitchy_mc.redstone.lamps.plus.block.BrownRedstoneLampBlock;
import glitchy_mc.redstone.lamps.plus.block.BlueRedstoneLampOnBlock;
import glitchy_mc.redstone.lamps.plus.block.BlueRedstoneLampBlock;
import glitchy_mc.redstone.lamps.plus.block.BlackRedstoneLampOnBlock;
import glitchy_mc.redstone.lamps.plus.block.BlackRedstoneLampBlock;
import glitchy_mc.redstone.lamps.plus.RslampsPlusMod;

public class RslampsPlusModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RslampsPlusMod.MODID);
	public static final RegistryObject<Block> WHITE_REDSTONE_LAMP = REGISTRY.register("white_redstone_lamp", () -> new WhiteRedstoneLampBlock());
	public static final RegistryObject<Block> ORANGE_REDSTONE_LAMP = REGISTRY.register("orange_redstone_lamp", () -> new OrangeRedstoneLampBlock());
	public static final RegistryObject<Block> MAGENTA_REDSTONE_LAMP = REGISTRY.register("magenta_redstone_lamp",
			() -> new MagentaRedstoneLampBlock());
	public static final RegistryObject<Block> LIGHT_BLUE_REDSTONE_LAMP = REGISTRY.register("light_blue_redstone_lamp",
			() -> new LightBlueRedstoneLampBlock());
	public static final RegistryObject<Block> YELLOW_REDSTONE_LAMP = REGISTRY.register("yellow_redstone_lamp", () -> new YellowRedstoneLampBlock());
	public static final RegistryObject<Block> LIME_REDSTONE_LAMP = REGISTRY.register("lime_redstone_lamp", () -> new LimeRedstoneLampBlock());
	public static final RegistryObject<Block> PINK_REDSTONE_LAMP = REGISTRY.register("pink_redstone_lamp", () -> new PinkRedstoneLampBlock());
	public static final RegistryObject<Block> GRAY_REDSTONE_LAMP = REGISTRY.register("gray_redstone_lamp", () -> new GrayRedstoneLampBlock());
	public static final RegistryObject<Block> LIGHT_GRAY_REDSTONE_LAMP = REGISTRY.register("light_gray_redstone_lamp",
			() -> new LightGrayRedstoneLampBlock());
	public static final RegistryObject<Block> CYAN_REDSTONE_LAMP = REGISTRY.register("cyan_redstone_lamp", () -> new CyanRedstoneLampBlock());
	public static final RegistryObject<Block> PURPLE_REDSTONE_LAMP = REGISTRY.register("purple_redstone_lamp", () -> new PurpleRedstoneLampBlock());
	public static final RegistryObject<Block> BLUE_REDSTONE_LAMP = REGISTRY.register("blue_redstone_lamp", () -> new BlueRedstoneLampBlock());
	public static final RegistryObject<Block> BROWN_REDSTONE_LAMP = REGISTRY.register("brown_redstone_lamp", () -> new BrownRedstoneLampBlock());
	public static final RegistryObject<Block> GREEN_REDSTONE_LAMP = REGISTRY.register("green_redstone_lamp", () -> new GreenRedstoneLampBlock());
	public static final RegistryObject<Block> RED_REDSTONE_LAMP = REGISTRY.register("red_redstone_lamp", () -> new RedRedstoneLampBlock());
	public static final RegistryObject<Block> BLACK_REDSTONE_LAMP = REGISTRY.register("black_redstone_lamp", () -> new BlackRedstoneLampBlock());
	public static final RegistryObject<Block> SOUL_LAMP = REGISTRY.register("soul_lamp", () -> new SoulLampBlock());
	public static final RegistryObject<Block> END_LAMP = REGISTRY.register("end_lamp", () -> new EndLampBlock());
	public static final RegistryObject<Block> RED_REDSTONE_LAMP_ON = REGISTRY.register("red_redstone_lamp_on", () -> new RedRedstoneLampOnBlock());
	public static final RegistryObject<Block> ORANGE_REDSTONE_LAMP_ON = REGISTRY.register("orange_redstone_lamp_on",
			() -> new OrangeRedstoneLampOnBlock());
	public static final RegistryObject<Block> YELLOW_REDSTONE_LAMP_ON = REGISTRY.register("yellow_redstone_lamp_on",
			() -> new YellowRedstoneLampOnBlock());
	public static final RegistryObject<Block> LIME_REDSTONE_LAMP_ON = REGISTRY.register("lime_redstone_lamp_on", () -> new LimeRedstoneLampOnBlock());
	public static final RegistryObject<Block> GREEN_REDSTONE_LAMP_ON = REGISTRY.register("green_redstone_lamp_on",
			() -> new GreenRedstoneLampOnBlock());
	public static final RegistryObject<Block> CYAN_REDSTONE_LAMP_ON = REGISTRY.register("cyan_redstone_lamp_on", () -> new CyanRedstoneLampOnBlock());
	public static final RegistryObject<Block> LIGHT_BLUE_REDSTONE_LAMP_ON = REGISTRY.register("light_blue_redstone_lamp_on",
			() -> new LightBlueRedstoneLampOnBlock());
	public static final RegistryObject<Block> BLUE_REDSTONE_LAMP_ON = REGISTRY.register("blue_redstone_lamp_on", () -> new BlueRedstoneLampOnBlock());
	public static final RegistryObject<Block> PURPLE_REDSTONE_LAMP_ON = REGISTRY.register("purple_redstone_lamp_on",
			() -> new PurpleRedstoneLampOnBlock());
	public static final RegistryObject<Block> MAGENTA_REDSTONE_LAMP_ON = REGISTRY.register("magenta_redstone_lamp_on",
			() -> new MagentaRedstoneLampOnBlock());
	public static final RegistryObject<Block> PINK_REDSTONE_LAMP_ON = REGISTRY.register("pink_redstone_lamp_on", () -> new PinkRedstoneLampOnBlock());
	public static final RegistryObject<Block> BROWN_REDSTONE_LAMP_ON = REGISTRY.register("brown_redstone_lamp_on",
			() -> new BrownRedstoneLampOnBlock());
	public static final RegistryObject<Block> WHITE_REDSTONE_LAMP_ON = REGISTRY.register("white_redstone_lamp_on",
			() -> new WhiteRedstoneLampOnBlock());
	public static final RegistryObject<Block> LIGHT_GRAY_REDSTONE_LAMP_ON = REGISTRY.register("light_gray_redstone_lamp_on",
			() -> new LightGrayRedstoneLampOnBlock());
	public static final RegistryObject<Block> GRAY_REDSTONE_LAMP_ON = REGISTRY.register("gray_redstone_lamp_on", () -> new GrayRedstoneLampOnBlock());
	public static final RegistryObject<Block> BLACK_REDSTONE_LAMP_ON = REGISTRY.register("black_redstone_lamp_on",
			() -> new BlackRedstoneLampOnBlock());
	public static final RegistryObject<Block> SOUL_LAMP_ON = REGISTRY.register("soul_lamp_on", () -> new SoulLampOnBlock());
	public static final RegistryObject<Block> END_LAMP_ON = REGISTRY.register("end_lamp_on", () -> new EndLampOnBlock());
}
