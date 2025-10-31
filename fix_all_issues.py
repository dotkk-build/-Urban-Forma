#!/usr/bin/env python3
import os
import shutil
import json

# 修复纹理文件命名问题
def fix_textures():
    textures_dir = "src/main/resources/assets/urbanforma/textures/block"
    
    # 定义正确的纹理文件映射
    texture_mapping = {
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
        "b_Black.png": "black_bb.png"
    }
    
    # 复制并重命名纹理文件
    for old_name, new_name in texture_mapping.items():
        old_path = os.path.join(textures_dir, old_name)
        new_path = os.path.join(textures_dir, new_name)
        
        if os.path.exists(old_path):
            shutil.copy2(old_path, new_path)
            print(f"复制纹理: {old_name} -> {new_name}")
    
    # 创建发光方块的纹理（复制基础纹理）
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
            shutil.copy2(base_path, glowing_path)
            print(f"创建发光纹理: {glowing_texture}")

# 修复模型文件配置
def fix_models():
    models_dir = "src/main/resources/assets/urbanforma/models/block"
    
    # 所有颜色系列
    color_series = [
        "white", "light_gray_1", "light_gray_2", "light_gray_3",
        "medium_gray_1", "medium_gray_2", "medium_gray_3",
        "dark_gray_1", "dark_gray_2", "dark_gray_3", "dark_gray_4",
        "blackish_gray", "black"
    ]
    
    # 修复基础方块模型
    for color in color_series:
        model_file = os.path.join(models_dir, f"{color}_building_block.json")
        if os.path.exists(model_file):
            with open(model_file, 'r') as f:
                model_data = json.load(f)
            
            # 更新纹理路径
            model_data["textures"]["all"] = f"urbanforma:block/{color}_building_block"
            
            with open(model_file, 'w') as f:
                json.dump(model_data, f, indent=2)
            print(f"修复模型: {color}_building_block.json")
    
    # 修复发光方块模型
    for color in color_series:
        model_file = os.path.join(models_dir, f"{color}_glowing_building_block.json")
        if os.path.exists(model_file):
            with open(model_file, 'r') as f:
                model_data = json.load(f)
            
            # 更新纹理路径
            model_data["textures"]["all"] = f"urbanforma:block/{color}_glowing_building_block"
            
            with open(model_file, 'w') as f:
                json.dump(model_data, f, indent=2)
            print(f"修复模型: {color}_glowing_building_block.json")

# 执行修复
if __name__ == "__main__":
    print("开始修复纹理文件...")
    fix_textures()
    
    print("\n开始修复模型文件...")
    fix_models()
    
    print("\n所有修复完成！")