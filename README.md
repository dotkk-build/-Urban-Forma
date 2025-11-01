# UrbanForma Minecraft Mod v1.03

## 项目概述
UrbanForma是一个Minecraft模组，专注于城市建筑和现代都市元素，特别是道路系统和城市基础设施。

## 项目结构
```
UrbanForma/
├── src/                    # 源代码目录
│   └── main/
│       ├── java/          # Java源代码
│       └── resources/     # 资源文件
├── assets/                # 资源文件夹
│   └── urbanforma/
│       ├── textures/      # 贴图文件夹
│       ├── lang/          # 语言文件
│       ├── models/        # 模型文件
│       └── blockstates/   # 方块状态文件
├── build.gradle           # Gradle构建配置
├── settings.gradle        # Gradle设置文件
├── gradle.properties      # Gradle属性配置
└── README.md              # 项目说明文档
```

### 技术特性
- 使用DirectionalRoadBlock实现方向性方块
- 完整的中文本地化支持
- 基于Minecraft Forge 1.20.1开发

### 贴图文件夹结构
```
textures/
├── block/                 # 方块贴图
├── item/                  # 物品贴图
├── entity/                # 实体贴图
└── gui/                   # 界面贴图
```

### 开发环境要求
- Java 17+
- Minecraft Forge 1.20.1
- Gradle 7.0+

### 代码结构
- `ModBlocks.java` - 方块注册管理
- `ModCreativeTabs.java` - 创造模式标签管理
- `DirectionalRoadBlock.java` - 方向性道路方块实现
- `zh_cn.json` - 中文本地化文件

### 更新计划
- 进行中 白线系列道路方块
- 进行中 黄线系列道路方块
- 进行中 道路地面标识
- 重构中 建筑方块材质精细化（针对16x16纯色贴图改为更适合大量使用的建筑常用方块16x16添加少量相近杂色并添加随机贴图旋转）
- 规划中 建筑方块色系补全（约72色）
- 规划中 建筑方块形状补全（光滑方块/像素方块）
- 规划中 道路周边装饰包
- 规划中 机场地面装饰及扩展
- 规划中 玻璃幕墙
- 规划中 玻璃缝
- 规划中 环氧地坪系列
- 规划中 竖半砖
- 规划中 建筑方块外墙
- 规划中 交通标识
