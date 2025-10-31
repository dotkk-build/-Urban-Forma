#!/usr/bin/env python3
import os
import json

# 定义所有颜色系列
color_series = [
    "white", "light_gray_1", "light_gray_2", "light_gray_3",
    "medium_gray_1", "medium_gray_2", "medium_gray_3",
    "dark_gray_1", "dark_gray_2", "dark_gray_3", "dark_gray_4",
    "blackish_gray", "black"
]

# 基础方块blockstates模板
base_block_template = {
    "variants": {
        "": { "model": "urbanforma:block/{color}_building_block" }
    }
}

# 发光方块blockstates模板
glowing_block_template = {
    "variants": {
        "": { "model": "urbanforma:block/{color}_glowing_building_block" }
    }
}

# 半砖方块blockstates模板
slab_template = {
    "variants": {
        "type=bottom": { "model": "urbanforma:block/{color}_slab_building_block" },
        "type=double": { "model": "urbanforma:block/{color}_building_block" },
        "type=top": { "model": "urbanforma:block/{color}_slab_building_block_top" }
    }
}

# 楼梯方块blockstates模板
stairs_template = {
    "variants": {
        "facing=east,half=bottom,shape=straight":  { "model": "urbanforma:block/{color}_stairs_building_block" },
        "facing=west,half=bottom,shape=straight":  { "model": "urbanforma:block/{color}_stairs_building_block", "y": 180, "uvlock": true },
        "facing=south,half=bottom,shape=straight": { "model": "urbanforma:block/{color}_stairs_building_block", "y": 90, "uvlock": true },
        "facing=north,half=bottom,shape=straight": { "model": "urbanforma:block/{color}_stairs_building_block", "y": 270, "uvlock": true },
        "facing=east,half=bottom,shape=outer_right":  { "model": "urbanforma:block/{color}_stairs_building_block_outer" },
        "facing=west,half=bottom,shape=outer_right":  { "model": "urbanforma:block/{color}_stairs_building_block_outer", "y": 180, "uvlock": true },
        "facing=south,half=bottom,shape=outer_right": { "model": "urbanforma:block/{color}_stairs_building_block_outer", "y": 90, "uvlock": true },
        "facing=north,half=bottom,shape=outer_right": { "model": "urbanforma:block/{color}_stairs_building_block_outer", "y": 270, "uvlock": true },
        "facing=east,half=bottom,shape=outer_left":  { "model": "urbanforma:block/{color}_stairs_building_block_outer", "y": 270, "uvlock": true },
        "facing=west,half=bottom,shape=outer_left":  { "model": "urbanforma:block/{color}_stairs_building_block_outer", "y": 90, "uvlock": true },
        "facing=south,half=bottom,shape=outer_left": { "model": "urbanforma:block/{color}_stairs_building_block_outer", "y": 180, "uvlock": true },
        "facing=north,half=bottom,shape=outer_left": { "model": "urbanforma:block/{color}_stairs_building_block_outer", "y": 0, "uvlock": true },
        "facing=east,half=bottom,shape=inner_right":  { "model": "urbanforma:block/{color}_stairs_building_block_inner" },
        "facing=west,half=bottom,shape=inner_right":  { "model": "urbanforma:block/{color}_stairs_building_block_inner", "y": 180, "uvlock": true },
        "facing=south,half=bottom,shape=inner_right": { "model": "urbanforma:block/{color}_stairs_building_block_inner", "y": 90, "uvlock": true },
        "facing=north,half=bottom,shape=inner_right": { "model": "urbanforma:block/{color}_stairs_building_block_inner", "y": 270, "uvlock": true },
        "facing=east,half=bottom,shape=inner_left":  { "model": "urbanforma:block/{color}_stairs_building_block_inner", "y": 270, "uvlock": true },
        "facing=west,half=bottom,shape=inner_left":  { "model": "urbanforma:block/{color}_stairs_building_block_inner", "y": 90, "uvlock": true },
        "facing=south,half=bottom,shape=inner_left": { "model": "urbanforma:block/{color}_stairs_building_block_inner", "y": 180, "uvlock": true },
        "facing=north,half=bottom,shape=inner_left": { "model": "urbanforma:block/{color}_stairs_building_block_inner", "y": 0, "uvlock": true },
        "facing=east,half=top,shape=straight":  { "model": "urbanforma:block/{color}_stairs_building_block", "x": 180, "uvlock": true },
        "facing=west,half=top,shape=straight":  { "model": "urbanforma:block/{color}_stairs_building_block", "x": 180, "y": 180, "uvlock": true },
        "facing=south,half=top,shape=straight": { "model": "urbanforma:block/{color}_stairs_building_block", "x": 180, "y": 90, "uvlock": true },
        "facing=north,half=top,shape=straight": { "model": "urbanforma:block/{color}_stairs_building_block", "x": 180, "y": 270, "uvlock": true },
        "facing=east,half=top,shape=outer_right":  { "model": "urbanforma:block/{color}_stairs_building_block_outer", "x": 180, "y": 90, "uvlock": true },
        "facing=west,half=top,shape=outer_right":  { "model": "urbanforma:block/{color}_stairs_building_block_outer", "x": 180, "y": 270, "uvlock": true },
        "facing=south,half=top,shape=outer_right": { "model": "urbanforma:block/{color}_stairs_building_block_outer", "x": 180, "y": 180, "uvlock": true },
        "facing=north,half=top,shape=outer_right": { "model": "urbanforma:block/{color}_stairs_building_block_outer", "x": 180, "y": 0, "uvlock": true },
        "facing=east,half=top,shape=outer_left":  { "model": "urbanforma:block/{color}_stairs_building_block_outer", "x": 180, "y": 0, "uvlock": true },
        "facing=west,half=top,shape=outer_left":  { "model": "urbanforma:block/{color}_stairs_building_block_outer", "x": 180, "y": 180, "uvlock": true },
        "facing=south,half=top,shape=outer_left": { "model": "urbanforma:block/{color}_stairs_building_block_outer", "x": 180, "y": 90, "uvlock": true },
        "facing=north,half=top,shape=outer_left": { "model": "urbanforma:block/{color}_stairs_building_block_outer", "x": 180, "y": 270, "uvlock": true },
        "facing=east,half=top,shape=inner_right":  { "model": "urbanforma:block/{color}_stairs_building_block_inner", "x": 180, "y": 90, "uvlock": true },
        "facing=west,half=top,shape=inner_right":  { "model": "urbanforma:block/{color}_stairs_building_block_inner", "x": 180, "y": 270, "uvlock": true },
        "facing=south,half=top,shape=inner_right": { "model": "urbanforma:block/{color}_stairs_building_block_inner", "x": 180, "y": 180, "uvlock": true },
        "facing=north,half=top,shape=inner_right": { "model": "urbanforma:block/{color}_stairs_building_block_inner", "x": 180, "y": 0, "uvlock": true },
        "facing=east,half=top,shape=inner_left":  { "model": "urbanforma:block/{color}_stairs_building_block_inner", "x": 180, "y": 0, "uvlock": true },
        "facing=west,half=top,shape=inner_left":  { "model": "urbanforma:block/{color}_stairs_building_block_inner", "x": 180, "y": 180, "uvlock": true },
        "facing=south,half=top,shape=inner_left": { "model": "urbanforma:block/{color}_stairs_building_block_inner", "x": 180, "y": 90, "uvlock": true },
        "facing=north,half=top,shape=inner_left": { "model": "urbanforma:block/{color}_stairs_building_block_inner", "x": 180, "y": 270, "uvlock": true }
    }
}

# blockstates文件目录
blockstates_dir = "src/main/resources/assets/urbanforma/blockstates"

# 确保目录存在
os.makedirs(blockstates_dir, exist_ok=True)

# 为每个颜色系列生成blockstates文件
for color in color_series:
    # 基础方块blockstates
    with open(f"{blockstates_dir}/{color}_building_block.json", "w") as f:
        json.dump(base_block_template, f, indent=2)
    
    # 发光方块blockstates
    with open(f"{blockstates_dir}/{color}_glowing_building_block.json", "w") as f:
        json.dump(glowing_block_template, f, indent=2)
    
    # 半砖方块blockstates
    with open(f"{blockstates_dir}/{color}_slab_building_block.json", "w") as f:
        json.dump(slab_template, f, indent=2)
    
    # 楼梯方块blockstates
    with open(f"{blockstates_dir}/{color}_stairs_building_block.json", "w") as f:
        json.dump(stairs_template, f, indent=2)

print(f"已为 {len(color_series)} 个颜色系列生成blockstates文件")