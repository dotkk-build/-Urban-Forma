#!/usr/bin/env python3
import os
import json

# 定义所有颜色系列
color_series = [
    "light_gray_1", "light_gray_2", "light_gray_3",
    "medium_gray_1", "medium_gray_2", "medium_gray_3",
    "dark_gray_1", "dark_gray_2", "dark_gray_3", "dark_gray_4",
    "blackish_gray", "black"
]

# 基础方块模型模板
base_block_template = {
    "parent": "minecraft:block/cube_all",
    "textures": {
        "all": "urbanforma:block/{color}_building_block"
    }
}

# 发光方块模型模板
glowing_block_template = {
    "parent": "minecraft:block/cube_all",
    "textures": {
        "all": "urbanforma:block/{color}_glowing_building_block"
    }
}

# 半砖方块模型模板
slab_template = {
    "parent": "minecraft:block/slab",
    "textures": {
        "bottom": "urbanforma:block/{color}_building_block",
        "top": "urbanforma:block/{color}_building_block",
        "side": "urbanforma:block/{color}_building_block"
    }
}

slab_top_template = {
    "parent": "minecraft:block/slab_top",
    "textures": {
        "bottom": "urbanforma:block/{color}_building_block",
        "top": "urbanforma:block/{color}_building_block",
        "side": "urbanforma:block/{color}_building_block"
    }
}

# 楼梯方块模型模板
stairs_template = {
    "parent": "minecraft:block/stairs",
    "textures": {
        "bottom": "urbanforma:block/{color}_building_block",
        "top": "urbanforma:block/{color}_building_block",
        "side": "urbanforma:block/{color}_building_block"
    }
}

stairs_inner_template = {
    "parent": "minecraft:block/inner_stairs",
    "textures": {
        "bottom": "urbanforma:block/{color}_building_block",
        "top": "urbanforma:block/{color}_building_block",
        "side": "urbanforma:block/{color}_building_block"
    }
}

stairs_outer_template = {
    "parent": "minecraft:block/outer_stairs",
    "textures": {
        "bottom": "urbanforma:block/{color}_building_block",
        "top": "urbanforma:block/{color}_building_block",
        "side": "urbanforma:block/{color}_building_block"
    }
}

# 模型文件目录
models_dir = "src/main/resources/assets/urbanforma/models/block"

# 确保目录存在
os.makedirs(models_dir, exist_ok=True)

# 为每个颜色系列生成模型文件
for color in color_series:
    # 基础方块
    with open(f"{models_dir}/{color}_building_block.json", "w") as f:
        json.dump(base_block_template, f, indent=2)
    
    # 发光方块
    with open(f"{models_dir}/{color}_glowing_building_block.json", "w") as f:
        json.dump(glowing_block_template, f, indent=2)
    
    # 半砖方块
    with open(f"{models_dir}/{color}_slab_building_block.json", "w") as f:
        json.dump(slab_template, f, indent=2)
    
    with open(f"{models_dir}/{color}_slab_building_block_top.json", "w") as f:
        json.dump(slab_top_template, f, indent=2)
    
    # 楼梯方块
    with open(f"{models_dir}/{color}_stairs_building_block.json", "w") as f:
        json.dump(stairs_template, f, indent=2)
    
    with open(f"{models_dir}/{color}_stairs_building_block_inner.json", "w") as f:
        json.dump(stairs_inner_template, f, indent=2)
    
    with open(f"{models_dir}/{color}_stairs_building_block_outer.json", "w") as f:
        json.dump(stairs_outer_template, f, indent=2)

print(f"已为 {len(color_series)} 个颜色系列生成模型文件")