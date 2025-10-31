# UrbanForma Minecraft Mod v1.02

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
- 支持创意标签分类（都市构方道路）
- 完整的中文本地化支持
- 基于Minecraft Forge 1.20.1开发

## 贴图系统

### 贴图文件夹位置
`d:\UrbanForma\assets\urbanforma\textures\`

### 贴图文件夹结构
```
textures/
├── block/                 # 方块贴图
├── item/                  # 物品贴图
├── entity/                # 实体贴图
└── gui/                   # 界面贴图
```

## 开发说明

### 构建命令
```bash
cd d:\UrbanForma
gradle build
```

### 开发环境要求
- Java 17+
- Minecraft Forge 1.20.1
- Gradle 7.0+

### 代码结构
- `ModBlocks.java` - 方块注册管理
- `ModCreativeTabs.java` - 创意标签管理
- `DirectionalRoadBlock.java` - 方向性道路方块实现
- `zh_cn.json` - 中文本地化文件

## 注意事项
- 贴图文件应为PNG格式
- 推荐贴图尺寸为16x16、32x32或64x64像素
- 确保贴图文件命名规范，与注册名称一致
- 所有道路方块都支持方向性放置
- 模型文件使用JSON格式，遵循Minecraft标准

## 未来计划
- 添加更多城市建筑方块
- 实现交通信号系统
- 添加车辆和行人实体
- 扩展道路类型和材质
