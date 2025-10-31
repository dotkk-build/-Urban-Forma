package com.urbanforma;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UrbanForma.MODID);

    // 都市构方基础物品栏 (a_1)
    public static final RegistryObject<CreativeModeTab> URBANFORMA_BASE_TAB = CREATIVE_MODE_TABS.register("a_1_urbanforma_base",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.a_1_urbanforma_base"))
            .icon(() -> new ItemStack(ModBlocks.WHITE_BUILDING_BLOCK.get()))
            .displayItems((parameters, output) -> {
                // 白色系列方块
                output.accept(ModBlocks.WHITE_BUILDING_BLOCK.get());
                output.accept(ModBlocks.WHITE_GLOWING_BUILDING_BLOCK.get());
                output.accept(ModBlocks.WHITE_SLAB_BUILDING_BLOCK.get());
                output.accept(ModBlocks.WHITE_STAIRS_BUILDING_BLOCK.get());
                
                // 亮灰系列方块 (1-3)
                output.accept(ModBlocks.LIGHT_GRAY_1_BUILDING_BLOCK.get());
                output.accept(ModBlocks.LIGHT_GRAY_1_GLOWING_BUILDING_BLOCK.get());
                output.accept(ModBlocks.LIGHT_GRAY_1_SLAB_BUILDING_BLOCK.get());
                output.accept(ModBlocks.LIGHT_GRAY_1_STAIRS_BUILDING_BLOCK.get());
                
                output.accept(ModBlocks.LIGHT_GRAY_2_BUILDING_BLOCK.get());
                output.accept(ModBlocks.LIGHT_GRAY_2_GLOWING_BUILDING_BLOCK.get());
                output.accept(ModBlocks.LIGHT_GRAY_2_SLAB_BUILDING_BLOCK.get());
                output.accept(ModBlocks.LIGHT_GRAY_2_STAIRS_BUILDING_BLOCK.get());
                
                output.accept(ModBlocks.LIGHT_GRAY_3_BUILDING_BLOCK.get());
                output.accept(ModBlocks.LIGHT_GRAY_3_GLOWING_BUILDING_BLOCK.get());
                output.accept(ModBlocks.LIGHT_GRAY_3_SLAB_BUILDING_BLOCK.get());
                output.accept(ModBlocks.LIGHT_GRAY_3_STAIRS_BUILDING_BLOCK.get());
                
                // 中灰系列方块 (1-3)
                output.accept(ModBlocks.MEDIUM_GRAY_1_BUILDING_BLOCK.get());
                output.accept(ModBlocks.MEDIUM_GRAY_1_GLOWING_BUILDING_BLOCK.get());
                output.accept(ModBlocks.MEDIUM_GRAY_1_SLAB_BUILDING_BLOCK.get());
                output.accept(ModBlocks.MEDIUM_GRAY_1_STAIRS_BUILDING_BLOCK.get());
                
                output.accept(ModBlocks.MEDIUM_GRAY_2_BUILDING_BLOCK.get());
                output.accept(ModBlocks.MEDIUM_GRAY_2_GLOWING_BUILDING_BLOCK.get());
                output.accept(ModBlocks.MEDIUM_GRAY_2_SLAB_BUILDING_BLOCK.get());
                output.accept(ModBlocks.MEDIUM_GRAY_2_STAIRS_BUILDING_BLOCK.get());
                
                output.accept(ModBlocks.MEDIUM_GRAY_3_BUILDING_BLOCK.get());
                output.accept(ModBlocks.MEDIUM_GRAY_3_GLOWING_BUILDING_BLOCK.get());
                output.accept(ModBlocks.MEDIUM_GRAY_3_SLAB_BUILDING_BLOCK.get());
                output.accept(ModBlocks.MEDIUM_GRAY_3_STAIRS_BUILDING_BLOCK.get());
                
                // 暗灰系列方块 (1-4)
                output.accept(ModBlocks.DARK_GRAY_1_BUILDING_BLOCK.get());
                output.accept(ModBlocks.DARK_GRAY_1_GLOWING_BUILDING_BLOCK.get());
                output.accept(ModBlocks.DARK_GRAY_1_SLAB_BUILDING_BLOCK.get());
                output.accept(ModBlocks.DARK_GRAY_1_STAIRS_BUILDING_BLOCK.get());
                
                output.accept(ModBlocks.DARK_GRAY_2_BUILDING_BLOCK.get());
                output.accept(ModBlocks.DARK_GRAY_2_GLOWING_BUILDING_BLOCK.get());
                output.accept(ModBlocks.DARK_GRAY_2_SLAB_BUILDING_BLOCK.get());
                output.accept(ModBlocks.DARK_GRAY_2_STAIRS_BUILDING_BLOCK.get());
                
                output.accept(ModBlocks.DARK_GRAY_3_BUILDING_BLOCK.get());
                output.accept(ModBlocks.DARK_GRAY_3_GLOWING_BUILDING_BLOCK.get());
                output.accept(ModBlocks.DARK_GRAY_3_SLAB_BUILDING_BLOCK.get());
                output.accept(ModBlocks.DARK_GRAY_3_STAIRS_BUILDING_BLOCK.get());
                
                output.accept(ModBlocks.DARK_GRAY_4_BUILDING_BLOCK.get());
                output.accept(ModBlocks.DARK_GRAY_4_GLOWING_BUILDING_BLOCK.get());
                output.accept(ModBlocks.DARK_GRAY_4_SLAB_BUILDING_BLOCK.get());
                output.accept(ModBlocks.DARK_GRAY_4_STAIRS_BUILDING_BLOCK.get());
                
                // 黑灰系列方块
                output.accept(ModBlocks.BLACKISH_GRAY_BUILDING_BLOCK.get());
                output.accept(ModBlocks.BLACKISH_GRAY_GLOWING_BUILDING_BLOCK.get());
                output.accept(ModBlocks.BLACKISH_GRAY_SLAB_BUILDING_BLOCK.get());
                output.accept(ModBlocks.BLACKISH_GRAY_STAIRS_BUILDING_BLOCK.get());
                
                // 黑色系列方块
                output.accept(ModBlocks.BLACK_BUILDING_BLOCK.get());
                output.accept(ModBlocks.BLACK_GLOWING_BUILDING_BLOCK.get());
                output.accept(ModBlocks.BLACK_SLAB_BUILDING_BLOCK.get());
                output.accept(ModBlocks.BLACK_STAIRS_BUILDING_BLOCK.get());
            })
            .build());

    // 都市构方道路物品栏 (a_2)
    public static final RegistryObject<CreativeModeTab> URBANFORMA_ROAD_TAB = CREATIVE_MODE_TABS.register("a_2_urbanforma_road",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.a_2_urbanforma_road"))
            .icon(() -> new ItemStack(ModBlocks.ROAD_A_GRAY.get()))
            .displayItems((parameters, output) -> {
                // 道路系列方块
                output.accept(ModBlocks.ROAD_A_GRAY.get());
                output.accept(ModBlocks.ROAD_A_GRAY_GLOWING.get());
                output.accept(ModBlocks.ROAD_A_GRAY_SLAB.get());
                output.accept(ModBlocks.ROAD_A_LIGHT_GRAY.get());
                output.accept(ModBlocks.ROAD_A_LIGHT_GRAY_GLOWING.get());
                output.accept(ModBlocks.ROAD_A_LIGHT_GRAY_SLAB.get());
                output.accept(ModBlocks.ROAD_A_WHITE.get());
                output.accept(ModBlocks.ROAD_A_WHITE_GLOWING.get());
                output.accept(ModBlocks.ROAD_A_WHITE_SLAB.get());
                output.accept(ModBlocks.ROAD_A_WHITE_LINE.get());
                output.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE.get());
                output.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_COMPENSATION.get());
                output.accept(ModBlocks.ROAD_A_WHITE_ZEBRA.get());
                output.accept(ModBlocks.ROAD_A_WHITE_CROSS.get());
                output.accept(ModBlocks.ROAD_A_WHITE_T_LINE.get());
                output.accept(ModBlocks.ROAD_A_WHITE_CORNER.get());
                output.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CONNECTION.get());
                output.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CONNECTION_REVERSE.get());
                output.accept(ModBlocks.ROAD_A_WHITE_LINE_END_1.get());
                output.accept(ModBlocks.ROAD_A_WHITE_LINE_END_2.get());
                output.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CONNECTION_EXTENSION.get());
                output.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CONNECTION_EXTENSION_REVERSE.get());
                output.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CONNECTION_EXTENSION_COMPENSATION.get());
                output.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CONNECTION_EXTENSION_COMPENSATION_REVERSE.get());
                output.accept(ModBlocks.ROAD_A_WHITE_CORNER_LINE.get());
                output.accept(ModBlocks.ROAD_A_WHITE_CORNER_LINE_REVERSE.get());
                output.accept(ModBlocks.ROAD_A_WHITE_THICK_BORDER.get());
                output.accept(ModBlocks.ROAD_A_WHITE_BORDER.get());
                output.accept(ModBlocks.ROAD_A_WHITE_THIN_BORDER.get());
                
                // 道路白小弯和道路白中弯系列
                output.accept(ModBlocks.ROAD_A_WHITE_SMALL_CURVE.get());
                output.accept(ModBlocks.ROAD_A_WHITE_MEDIUM_CURVE_1.get());
                output.accept(ModBlocks.ROAD_A_WHITE_MEDIUM_CURVE_1_REVERSE.get());
                output.accept(ModBlocks.ROAD_A_WHITE_MEDIUM_CURVE_2.get());
                output.accept(ModBlocks.ROAD_A_WHITE_MEDIUM_CURVE_2_REVERSE.get());
                
                // 道路白45度弯系列
                output.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CURVE_1.get());
                output.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CURVE_1_REVERSE.get());
                output.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CURVE_2.get());
                output.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CURVE_2_REVERSE.get());
                output.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CURVE_3.get());
                output.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CURVE_3_REVERSE.get());
                output.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CURVE_4.get());
                output.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CURVE_4_REVERSE.get());
            })
            .build());

    // 都市构方LOGO及标识物品栏 (a_3)
    public static final RegistryObject<CreativeModeTab> URBANFORMA_LOGO_TAB = CREATIVE_MODE_TABS.register("a_3_urbanforma_logo",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.a_3_urbanforma_logo"))
            .icon(() -> new ItemStack(ModBlocks.WHITE_BUILDING_BLOCK.get()))
            .displayItems((parameters, output) -> {
                // LOGO和标识相关方块可以在这里添加
                // 暂时为空，后续可以添加标识方块
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}