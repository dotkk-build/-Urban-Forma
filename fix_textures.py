#!/usr/bin/env python3
import os
import shutil

# 纹理文件目录
textures_dir = "assets/urbanforma/textures/block"

# 定义颜色映射 - 将现有纹理文件重命名为代码期望的名称
color_mapping = {
    # 基础方块纹理
    "b_White.png": "white_bb.png",
    "b_Light_Gray_1.png": "lg_1_bb.png",
    "b_Light_Gray_2.png": "lg_2_bb.png",
    "b_Light_Gray_3.png": "lg_3_bb.png",
    "b_Medium_Gray_1.png": "mg_1_bb.png",
    "b_Medium_Gray_2.png": "mg_2_bb.png",
    "b_Medium_Gray_3.png": "mg_3_bb.png",
    "b_Dark_Gray_1.png": "dg_1_bb.png",
    "b_Dark_Gray_2.png": "dg_2_bb.png",
    "b_Dark_Gray_3.png": "dg_3_bb.png",
    "b_Dark_Gray_4.png": "dg_4_bb.png",
    "b_Blackish_Gray.png": "bg_bb.png",
    "b_Black.png": "black_bb.png",
    
    # 道路纹理（暂时保留）
    "road_a_gray.png": "road_a_gray.png",
    "road_a_light_gray.png": "road_a_light_gray.png",
    "road_a_white.png": "road_a_white.png",
    
    # 其他纹理
    "1_Urban Forma.png": "1_urban_forma.png",
    "a_Apple.png": "a_apple.png",
    "a_Huawei.png": "a_huawei.png",
    "a_Xiaomi.png": "a_xiaomi.png"
}

# 确保目录存在
os.makedirs(textures_dir, exist_ok=True)

# 重命名纹理文件
for old_name, new_name in color_mapping.items():
    old_path = os.path.join(textures_dir, old_name)
    new_path = os.path.join(textures_dir, new_name)
    
    if os.path.exists(old_path):
        # 复制文件到新名称（保留原文件）
        shutil.copy2(old_path, new_path)
        print(f"已复制: {old_name} -> {new_name}")
    else:
        print(f"警告: 文件不存在: {old_name}")

# 创建发光方块的纹理文件（复制基础方块纹理并添加发光效果）
base_colors = [
    "white", "light_gray_1", "light_gray_2", "light_gray_3",
    "medium_gray_1", "medium_gray_2", "medium_gray_3",
    "dark_gray_1", "dark_gray_2", "dark_gray_3", "dark_gray_4",
    "blackish_gray", "black"
]

for color in base_colors:
    base_texture = f"{color}_building_block.png"
    glowing_texture = f"{color}_glowing_building_block.png"
    
    base_path = os.path.join(textures_dir, base_texture)
    glowing_path = os.path.join(textures_dir, glowing_texture)
    
    if os.path.exists(base_path):
        # 复制基础纹理作为发光纹理（实际游戏中发光效果由代码控制）
        shutil.copy2(base_path, glowing_path)
        print(f"已创建发光纹理: {glowing_texture}")
    else:
        print(f"警告: 基础纹理不存在: {base_texture}")

print("纹理文件修复完成！")