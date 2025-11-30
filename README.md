# Just Enough Pixelmon

## 项目简介
Just Enough Pixelmon (JEP) 是一个专为Minecraft Forge 1.12.2设计的模组，它为Just Enough Items (JEI) 提供了Pixelmon模组的集成支持。该模组使玩家能够在游戏中查看Pixelmon相关的各种掉落物、合成和互动信息，大大提高了游戏体验和便利性。

## 环境要求

### 软件要求
- Minecraft 1.12.2
- Minecraft Forge 14.23.5.2816或更高版本
- Just Enough Items (JEI) 4.7.8.19
- Pixelmon 模组（最新兼容版本）
- Java 8 或更高版本

## 安装指南

### 基本安装步骤
1. 确保已安装Minecraft 1.12.2
2. 安装Minecraft Forge 14.23.5.2816或更高版本
3. 下载并安装Just Enough Items (JEI) 4.7.8.19
4. 下载并安装Pixelmon模组
5. 下载JustEnoughPixelmon模组文件
6. 将所有模组文件放入Minecraft安装目录下的`mods`文件夹中
7. 启动Minecraft，享受增强的游戏体验

### 开发环境设置
1. 克隆本仓库：`git clone git@github.com:Duckfox/JustEnoughPixelmon.git`
2. 进入项目目录：`cd JustEnoughPixelmon`
3. 运行ForgeGradle设置命令：
   - Windows: `gradlew setupDecompWorkspace`
   - Linux/Mac: `./gradlew setupDecompWorkspace`
4. 为IDE准备环境：
   - Eclipse: `gradlew eclipse`
   - IntelliJ IDEA: `gradlew idea`
5. 打开项目并开始开发

## 功能列表

Just Enough Pixelmon 为JEI添加了以下信息类别：

- **宝可梦掉落物** - 查看各种宝可梦可能掉落的物品
- **宝可梦持有物** - 查看宝可梦可能持有的物品
- **巢穴掉落物** - 查看宝可梦巢穴可能掉落的物品
- **Boss掉落物** - 查看Boss宝可梦掉落的特殊物品
- **采集信息** - 显示可通过采集技能获取的物品
- **头锤技能** - 显示可通过头锤技能获得的物品
- **碎岩技能** - 显示可通过碎岩技能获得的物品
- **钓鱼信息** - 显示可通过钓鱼获得的物品
- **注入器合成** - 显示使用注入器的合成配方
- **店主交易** - 显示游戏中店主的交易信息

## 使用方法

安装完成后，在游戏中按`E`键打开物品栏，然后按`R`键打开JEI界面。在搜索框中输入物品名称或使用鼠标悬停在物品上，即可查看相关的合成、掉落或交易信息。

要查看特定类别的所有信息，点击JEI界面右侧的图标选择相应类别。

## 配置说明

目前，Just Enough Pixelmon 不需要额外的配置文件。模组会自动与JEI和Pixelmon集成，无需用户干预。

## 常见问题

**Q: 安装后没有看到额外的JEI信息怎么办？**
A: 请确保所有依赖模组都已正确安装且版本兼容。

**Q: 某些掉落物信息不完整或不正确？**
A: 这可能是由于Pixelmon版本更新导致的。请检查是否有JustEnoughPixelmon的更新版本。

## 贡献指南

我们欢迎社区的贡献！如果你想为项目做出贡献，请遵循以下步骤：

1. Fork本仓库
2. 创建你的特性分支：`git checkout -b feature/amazing-feature`
3. 提交你的更改：`git commit -m 'Add some amazing feature'`
4. 推送到分支：`git push origin feature/amazing-feature`
5. 打开一个Pull Request

## 许可证

本项目采用MIT许可证 - 详情请查看LICENSE文件

## 更新日志

### 1.1
- 修复了部分掉落物信息
- 增加了对最新版Pixelmon的兼容性
- 优化了JEI界面显示

### 1.0
- 初始版本发布
- 添加了所有基本功能类别
- 实现了与JEI的基本集成

### 最新变更
- 项目已从master分支迁移到main分支
- 完善了README.md文件内容

## 联系方式

项目维护者：Duck_fox
GitHub: [Duckfox/JustEnoughPixelmon](https://github.com/Duckfox/JustEnoughPixelmon)

---

*Just Enough Pixelmon 是一个非官方的模组，与Minecraft、Mojang Studios和Pixelmon团队没有直接关联。*