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
