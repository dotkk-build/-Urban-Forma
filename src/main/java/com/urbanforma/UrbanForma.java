package com.urbanforma;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(UrbanForma.MODID)
public class UrbanForma {
    public static final String MODID = "urbanforma";
    private static final Logger LOGGER = LogUtils.getLogger();

    public UrbanForma() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        
        ModBlocks.register(modEventBus);
        ModCreativeTabs.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("UrbanForma 模组加载完成 - 作者: Dotkk");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == ModCreativeTabs.URBANFORMA_BASE_TAB.getKey()) {
            // 白色系列方块
            event.accept(ModBlocks.WHITE_BUILDING_BLOCK);
            event.accept(ModBlocks.WHITE_GLOWING_BUILDING_BLOCK);
            event.accept(ModBlocks.WHITE_SLAB_BUILDING_BLOCK);
            event.accept(ModBlocks.WHITE_STAIRS_BUILDING_BLOCK);
            
            // 亮灰系列方块 (1-3)
            event.accept(ModBlocks.LIGHT_GRAY_1_BUILDING_BLOCK);
            event.accept(ModBlocks.LIGHT_GRAY_1_GLOWING_BUILDING_BLOCK);
            event.accept(ModBlocks.LIGHT_GRAY_1_SLAB_BUILDING_BLOCK);
            event.accept(ModBlocks.LIGHT_GRAY_1_STAIRS_BUILDING_BLOCK);
            
            event.accept(ModBlocks.LIGHT_GRAY_2_BUILDING_BLOCK);
            event.accept(ModBlocks.LIGHT_GRAY_2_GLOWING_BUILDING_BLOCK);
            event.accept(ModBlocks.LIGHT_GRAY_2_SLAB_BUILDING_BLOCK);
            event.accept(ModBlocks.LIGHT_GRAY_2_STAIRS_BUILDING_BLOCK);
            
            event.accept(ModBlocks.LIGHT_GRAY_3_BUILDING_BLOCK);
            event.accept(ModBlocks.LIGHT_GRAY_3_GLOWING_BUILDING_BLOCK);
            event.accept(ModBlocks.LIGHT_GRAY_3_SLAB_BUILDING_BLOCK);
            event.accept(ModBlocks.LIGHT_GRAY_3_STAIRS_BUILDING_BLOCK);
            
            // 中灰系列方块 (1-3)
            event.accept(ModBlocks.MEDIUM_GRAY_1_BUILDING_BLOCK);
            event.accept(ModBlocks.MEDIUM_GRAY_1_GLOWING_BUILDING_BLOCK);
            event.accept(ModBlocks.MEDIUM_GRAY_1_SLAB_BUILDING_BLOCK);
            event.accept(ModBlocks.MEDIUM_GRAY_1_STAIRS_BUILDING_BLOCK);
            
            event.accept(ModBlocks.MEDIUM_GRAY_2_BUILDING_BLOCK);
            event.accept(ModBlocks.MEDIUM_GRAY_2_GLOWING_BUILDING_BLOCK);
            event.accept(ModBlocks.MEDIUM_GRAY_2_SLAB_BUILDING_BLOCK);
            event.accept(ModBlocks.MEDIUM_GRAY_2_STAIRS_BUILDING_BLOCK);
            
            event.accept(ModBlocks.MEDIUM_GRAY_3_BUILDING_BLOCK);
            event.accept(ModBlocks.MEDIUM_GRAY_3_GLOWING_BUILDING_BLOCK);
            event.accept(ModBlocks.MEDIUM_GRAY_3_SLAB_BUILDING_BLOCK);
            event.accept(ModBlocks.MEDIUM_GRAY_3_STAIRS_BUILDING_BLOCK);
            
            // 暗灰系列方块 (1-4)
            event.accept(ModBlocks.DARK_GRAY_1_BUILDING_BLOCK);
            event.accept(ModBlocks.DARK_GRAY_1_GLOWING_BUILDING_BLOCK);
            event.accept(ModBlocks.DARK_GRAY_1_SLAB_BUILDING_BLOCK);
            event.accept(ModBlocks.DARK_GRAY_1_STAIRS_BUILDING_BLOCK);
            
            event.accept(ModBlocks.DARK_GRAY_2_BUILDING_BLOCK);
            event.accept(ModBlocks.DARK_GRAY_2_GLOWING_BUILDING_BLOCK);
            event.accept(ModBlocks.DARK_GRAY_2_SLAB_BUILDING_BLOCK);
            event.accept(ModBlocks.DARK_GRAY_2_STAIRS_BUILDING_BLOCK);
            
            event.accept(ModBlocks.DARK_GRAY_3_BUILDING_BLOCK);
            event.accept(ModBlocks.DARK_GRAY_3_GLOWING_BUILDING_BLOCK);
            event.accept(ModBlocks.DARK_GRAY_3_SLAB_BUILDING_BLOCK);
            event.accept(ModBlocks.DARK_GRAY_3_STAIRS_BUILDING_BLOCK);
            
            event.accept(ModBlocks.DARK_GRAY_4_BUILDING_BLOCK);
            event.accept(ModBlocks.DARK_GRAY_4_GLOWING_BUILDING_BLOCK);
            event.accept(ModBlocks.DARK_GRAY_4_SLAB_BUILDING_BLOCK);
            event.accept(ModBlocks.DARK_GRAY_4_STAIRS_BUILDING_BLOCK);
            
            // 黑灰系列方块
            event.accept(ModBlocks.BLACKISH_GRAY_BUILDING_BLOCK);
            event.accept(ModBlocks.BLACKISH_GRAY_GLOWING_BUILDING_BLOCK);
            event.accept(ModBlocks.BLACKISH_GRAY_SLAB_BUILDING_BLOCK);
            event.accept(ModBlocks.BLACKISH_GRAY_STAIRS_BUILDING_BLOCK);
            
            // 黑色系列方块
            event.accept(ModBlocks.BLACK_BUILDING_BLOCK);
            event.accept(ModBlocks.BLACK_GLOWING_BUILDING_BLOCK);
            event.accept(ModBlocks.BLACK_SLAB_BUILDING_BLOCK);
            event.accept(ModBlocks.BLACK_STAIRS_BUILDING_BLOCK);
            
            // 道路系列方块
            event.accept(ModBlocks.ROAD_A_GRAY);
            event.accept(ModBlocks.ROAD_A_GRAY_GLOWING);
            event.accept(ModBlocks.ROAD_A_GRAY_SLAB);
            event.accept(ModBlocks.ROAD_A_LIGHT_GRAY);
            event.accept(ModBlocks.ROAD_A_LIGHT_GRAY_GLOWING);
            event.accept(ModBlocks.ROAD_A_LIGHT_GRAY_SLAB);
            event.accept(ModBlocks.ROAD_A_WHITE);
            event.accept(ModBlocks.ROAD_A_WHITE_GLOWING);
            event.accept(ModBlocks.ROAD_A_WHITE_SLAB);
            event.accept(ModBlocks.ROAD_A_WHITE_LINE);
            event.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE);
            event.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_COMPENSATION);
            event.accept(ModBlocks.ROAD_A_WHITE_ZEBRA);
            event.accept(ModBlocks.ROAD_A_WHITE_CROSS);
            event.accept(ModBlocks.ROAD_A_WHITE_T_LINE);
            event.accept(ModBlocks.ROAD_A_WHITE_CORNER);
            event.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CONNECTION);
            event.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CONNECTION_REVERSE);
            event.accept(ModBlocks.ROAD_A_WHITE_LINE_END_1);
            event.accept(ModBlocks.ROAD_A_WHITE_LINE_END_2);
            event.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CONNECTION_EXTENSION);
            event.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CONNECTION_EXTENSION_REVERSE);
            event.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CONNECTION_EXTENSION_COMPENSATION);
            event.accept(ModBlocks.ROAD_A_WHITE_45_DEGREE_CONNECTION_EXTENSION_COMPENSATION_REVERSE);
            event.accept(ModBlocks.ROAD_A_WHITE_THICK_BORDER);
            event.accept(ModBlocks.ROAD_A_WHITE_BORDER);
            event.accept(ModBlocks.ROAD_A_WHITE_THIN_BORDER);
        }
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}