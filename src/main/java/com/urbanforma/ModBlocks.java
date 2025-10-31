package com.urbanforma;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = 
        DeferredRegister.create(ForgeRegistries.BLOCKS, UrbanForma.MODID);
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, UrbanForma.MODID);
    
    // 通用方块属性配置
    private static final BlockBehaviour.Properties BASIC_PROPERTIES = BlockBehaviour.Properties.of()
        .mapColor(MapColor.STONE)
        .strength(2.0f)
        .requiresCorrectToolForDrops()
        .sound(SoundType.STONE);
    
    private static final BlockBehaviour.Properties GLOWING_PROPERTIES = BlockBehaviour.Properties.of()
        .mapColor(MapColor.STONE)
        .strength(2.0f)
        .requiresCorrectToolForDrops()
        .sound(SoundType.STONE)
        .lightLevel(state -> 15);
    
    
    // 辅助方法：简化方块注册
    private static RegistryObject<Block> registerBasicBlock(String name) {
        return registerBlock(name, () -> new Block(BASIC_PROPERTIES));
    }
    
    private static RegistryObject<Block> registerGlowingBlock(String name) {
        return registerBlock(name, () -> new Block(GLOWING_PROPERTIES));
    }
    
    private static RegistryObject<Block> registerSlabBlock(String name) {
        return registerBlock(name, () -> new SlabBlock(BASIC_PROPERTIES));
    }
    
    private static RegistryObject<Block> registerStairBlock(String name, Supplier<Block> baseBlock) {
        return registerBlock(name, () -> new StairBlock(() -> baseBlock.get().defaultBlockState(), BASIC_PROPERTIES));
    }
    
    private static RegistryObject<Block> registerBlock(String name, Supplier<? extends Block> supplier) {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }
    
    // 白色系列方块
    public static final RegistryObject<Block> WHITE_BUILDING_BLOCK = registerBasicBlock("w_bb");
    public static final RegistryObject<Block> WHITE_GLOWING_BUILDING_BLOCK = registerGlowingBlock("w_gbb");
    public static final RegistryObject<Block> WHITE_SLAB_BUILDING_BLOCK = registerSlabBlock("w_sbb");
    public static final RegistryObject<Block> WHITE_STAIRS_BUILDING_BLOCK = registerStairBlock("w_stbb", WHITE_BUILDING_BLOCK);
    
    // 亮灰系列方块 (1-3)
    public static final RegistryObject<Block> LIGHT_GRAY_1_BUILDING_BLOCK = registerBasicBlock("lg_1_bb");
    public static final RegistryObject<Block> LIGHT_GRAY_1_GLOWING_BUILDING_BLOCK = registerGlowingBlock("lg_1_gbb");
    public static final RegistryObject<Block> LIGHT_GRAY_1_SLAB_BUILDING_BLOCK = registerSlabBlock("lg_1_sbb");
    public static final RegistryObject<Block> LIGHT_GRAY_1_STAIRS_BUILDING_BLOCK = registerStairBlock("lg_1_stbb", LIGHT_GRAY_1_BUILDING_BLOCK);
    
    public static final RegistryObject<Block> LIGHT_GRAY_2_BUILDING_BLOCK = registerBasicBlock("lg_2_bb");
    public static final RegistryObject<Block> LIGHT_GRAY_2_GLOWING_BUILDING_BLOCK = registerGlowingBlock("lg_2_gbb");
    public static final RegistryObject<Block> LIGHT_GRAY_2_SLAB_BUILDING_BLOCK = registerSlabBlock("lg_2_sbb");
    public static final RegistryObject<Block> LIGHT_GRAY_2_STAIRS_BUILDING_BLOCK = registerStairBlock("lg_2_stbb", LIGHT_GRAY_2_BUILDING_BLOCK);
    
    public static final RegistryObject<Block> LIGHT_GRAY_3_BUILDING_BLOCK = registerBasicBlock("lg_3_bb");
    public static final RegistryObject<Block> LIGHT_GRAY_3_GLOWING_BUILDING_BLOCK = registerGlowingBlock("lg_3_gbb");
    public static final RegistryObject<Block> LIGHT_GRAY_3_SLAB_BUILDING_BLOCK = registerSlabBlock("lg_3_sbb");
    public static final RegistryObject<Block> LIGHT_GRAY_3_STAIRS_BUILDING_BLOCK = registerStairBlock("lg_3_stbb", LIGHT_GRAY_3_BUILDING_BLOCK);
    
    // 中灰系列方块 (1-3)
    public static final RegistryObject<Block> MEDIUM_GRAY_1_BUILDING_BLOCK = registerBasicBlock("mg_1_bb");
    public static final RegistryObject<Block> MEDIUM_GRAY_1_GLOWING_BUILDING_BLOCK = registerGlowingBlock("mg_1_gbb");
    public static final RegistryObject<Block> MEDIUM_GRAY_1_SLAB_BUILDING_BLOCK = registerSlabBlock("mg_1_sbb");
    public static final RegistryObject<Block> MEDIUM_GRAY_1_STAIRS_BUILDING_BLOCK = registerStairBlock("mg_1_stbb", MEDIUM_GRAY_1_BUILDING_BLOCK);
    
    public static final RegistryObject<Block> MEDIUM_GRAY_2_BUILDING_BLOCK = registerBasicBlock("mg_2_bb");
    public static final RegistryObject<Block> MEDIUM_GRAY_2_GLOWING_BUILDING_BLOCK = registerGlowingBlock("mg_2_gbb");
    public static final RegistryObject<Block> MEDIUM_GRAY_2_SLAB_BUILDING_BLOCK = registerSlabBlock("mg_2_sbb");
    public static final RegistryObject<Block> MEDIUM_GRAY_2_STAIRS_BUILDING_BLOCK = registerStairBlock("mg_2_stbb", MEDIUM_GRAY_2_BUILDING_BLOCK);
    
    public static final RegistryObject<Block> MEDIUM_GRAY_3_BUILDING_BLOCK = registerBasicBlock("mg_3_bb");
    public static final RegistryObject<Block> MEDIUM_GRAY_3_GLOWING_BUILDING_BLOCK = registerGlowingBlock("mg_3_gbb");
    public static final RegistryObject<Block> MEDIUM_GRAY_3_SLAB_BUILDING_BLOCK = registerSlabBlock("mg_3_sbb");
    public static final RegistryObject<Block> MEDIUM_GRAY_3_STAIRS_BUILDING_BLOCK = registerStairBlock("mg_3_stbb", MEDIUM_GRAY_3_BUILDING_BLOCK);
    
    // 暗灰系列方块 (1-4)
    public static final RegistryObject<Block> DARK_GRAY_1_BUILDING_BLOCK = registerBasicBlock("dg_1_bb");
    public static final RegistryObject<Block> DARK_GRAY_1_GLOWING_BUILDING_BLOCK = registerGlowingBlock("dg_1_gbb");
    public static final RegistryObject<Block> DARK_GRAY_1_SLAB_BUILDING_BLOCK = registerSlabBlock("dg_1_sbb");
    public static final RegistryObject<Block> DARK_GRAY_1_STAIRS_BUILDING_BLOCK = registerStairBlock("dg_1_stbb", DARK_GRAY_1_BUILDING_BLOCK);
    
    public static final RegistryObject<Block> DARK_GRAY_2_BUILDING_BLOCK = registerBasicBlock("dg_2_bb");
    public static final RegistryObject<Block> DARK_GRAY_2_GLOWING_BUILDING_BLOCK = registerGlowingBlock("dg_2_gbb");
    public static final RegistryObject<Block> DARK_GRAY_2_SLAB_BUILDING_BLOCK = registerSlabBlock("dg_2_sbb");
    public static final RegistryObject<Block> DARK_GRAY_2_STAIRS_BUILDING_BLOCK = registerStairBlock("dg_2_stbb", DARK_GRAY_2_BUILDING_BLOCK);
    
    public static final RegistryObject<Block> DARK_GRAY_3_BUILDING_BLOCK = registerBasicBlock("dg_3_bb");
    public static final RegistryObject<Block> DARK_GRAY_3_GLOWING_BUILDING_BLOCK = registerGlowingBlock("dg_3_gbb");
    public static final RegistryObject<Block> DARK_GRAY_3_SLAB_BUILDING_BLOCK = registerSlabBlock("dg_3_sbb");
    public static final RegistryObject<Block> DARK_GRAY_3_STAIRS_BUILDING_BLOCK = registerStairBlock("dg_3_stbb", DARK_GRAY_3_BUILDING_BLOCK);
    
    public static final RegistryObject<Block> DARK_GRAY_4_BUILDING_BLOCK = registerBasicBlock("dg_4_bb");
    public static final RegistryObject<Block> DARK_GRAY_4_GLOWING_BUILDING_BLOCK = registerGlowingBlock("dg_4_gbb");
    public static final RegistryObject<Block> DARK_GRAY_4_SLAB_BUILDING_BLOCK = registerSlabBlock("dg_4_sbb");
    public static final RegistryObject<Block> DARK_GRAY_4_STAIRS_BUILDING_BLOCK = registerStairBlock("dg_4_stbb", DARK_GRAY_4_BUILDING_BLOCK);
    
    // 黑灰系列方块
    public static final RegistryObject<Block> BLACKISH_GRAY_BUILDING_BLOCK = registerBasicBlock("bg_bb");
    public static final RegistryObject<Block> BLACKISH_GRAY_GLOWING_BUILDING_BLOCK = registerGlowingBlock("bg_gbb");
    public static final RegistryObject<Block> BLACKISH_GRAY_SLAB_BUILDING_BLOCK = registerSlabBlock("bg_sbb");
    public static final RegistryObject<Block> BLACKISH_GRAY_STAIRS_BUILDING_BLOCK = registerStairBlock("bg_stbb", BLACKISH_GRAY_BUILDING_BLOCK);
    
    // 黑色系列方块
    public static final RegistryObject<Block> BLACK_BUILDING_BLOCK = registerBasicBlock("b_bb");
    public static final RegistryObject<Block> BLACK_GLOWING_BUILDING_BLOCK = registerGlowingBlock("b_gbb");
    public static final RegistryObject<Block> BLACK_SLAB_BUILDING_BLOCK = registerSlabBlock("b_sbb");
    public static final RegistryObject<Block> BLACK_STAIRS_BUILDING_BLOCK = registerStairBlock("b_stbb", BLACK_BUILDING_BLOCK);
    
    // 道路系列方块
    public static final RegistryObject<Block> ROAD_A_GRAY = registerBasicBlock("r_gray");
    public static final RegistryObject<Block> ROAD_A_GRAY_GLOWING = registerGlowingBlock("r_gray_g");
    public static final RegistryObject<Block> ROAD_A_GRAY_SLAB = registerSlabBlock("r_gray_s");
    
    public static final RegistryObject<Block> ROAD_A_LIGHT_GRAY = registerBasicBlock("r_lgray");
    public static final RegistryObject<Block> ROAD_A_LIGHT_GRAY_GLOWING = registerGlowingBlock("r_lgray_g");
    public static final RegistryObject<Block> ROAD_A_LIGHT_GRAY_SLAB = registerSlabBlock("r_lgray_s");
    
    public static final RegistryObject<Block> ROAD_A_WHITE = registerBasicBlock("r_white");
    public static final RegistryObject<Block> ROAD_A_WHITE_GLOWING = registerGlowingBlock("r_white_g");
    public static final RegistryObject<Block> ROAD_A_WHITE_SLAB = registerSlabBlock("r_white_s");
    
    public static final RegistryObject<Block> ROAD_A_WHITE_LINE = registerBlock("r_wl1", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_45_DEGREE = registerBlock("r_wl2", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_45_DEGREE_COMPENSATION = registerBlock("r_wl3", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_ZEBRA = registerBlock("r_wl4", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_CROSS = registerBlock("r_wl5", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_T_LINE = registerBlock("r_wl6", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_CORNER = registerBlock("r_wl7", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_45_DEGREE_CONNECTION = registerBlock("r_wl8", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_45_DEGREE_CONNECTION_REVERSE = registerBlock("r_wl9", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_LINE_END_1 = registerBlock("r_wl10", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_LINE_END_2 = registerBlock("r_wl11", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_45_DEGREE_CONNECTION_EXTENSION = registerBlock("r_wl12", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_45_DEGREE_CONNECTION_EXTENSION_REVERSE = registerBlock("r_wl13", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_45_DEGREE_CONNECTION_EXTENSION_COMPENSATION = registerBlock("r_wl14", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_45_DEGREE_CONNECTION_EXTENSION_COMPENSATION_REVERSE = registerBlock("r_wl15", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    
    public static final RegistryObject<Block> ROAD_A_WHITE_CORNER_LINE = registerBlock("r_wl16", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_CORNER_LINE_REVERSE = registerBlock("r_wl17", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    
    public static final RegistryObject<Block> ROAD_A_WHITE_THICK_BORDER = registerBlock("r_wl1a", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_BORDER = registerBlock("r_wl1b", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_THIN_BORDER = registerBlock("r_wl1c", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    
    // 道路白小弯和道路白中弯系列
    public static final RegistryObject<Block> ROAD_A_WHITE_SMALL_CURVE = registerBlock("r_wl18", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_MEDIUM_CURVE_1 = registerBlock("r_wl19", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_MEDIUM_CURVE_1_REVERSE = registerBlock("r_wl20", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_MEDIUM_CURVE_2 = registerBlock("r_wl21", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_MEDIUM_CURVE_2_REVERSE = registerBlock("r_wl22", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    
    // 道路白45度弯系列
    public static final RegistryObject<Block> ROAD_A_WHITE_45_DEGREE_CURVE_1 = registerBlock("r_wl23", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_45_DEGREE_CURVE_1_REVERSE = registerBlock("r_wl24", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_45_DEGREE_CURVE_2 = registerBlock("r_wl25", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_45_DEGREE_CURVE_2_REVERSE = registerBlock("r_wl26", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_45_DEGREE_CURVE_3 = registerBlock("r_wl27", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_45_DEGREE_CURVE_3_REVERSE = registerBlock("r_wl28", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_45_DEGREE_CURVE_4 = registerBlock("r_wl29", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    public static final RegistryObject<Block> ROAD_A_WHITE_45_DEGREE_CURVE_4_REVERSE = registerBlock("r_wl30", () -> new com.urbanforma.block.DirectionalRoadBlock(BASIC_PROPERTIES));
    
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}