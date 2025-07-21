## hs-card-plugin-template

此项目为[Hearthstone-Script](https://github.com/xjw580/Hearthstone-Script)的卡牌插件模板




## 协议

本项目遵循 **[GPL3.0开源协议](LICENSE)** 及 **[禁止商用附加协议](LICENSE1)**



### 前置

1. 阅读 [hs-script-card-sdk ](https://github.com/xjw580/hs-script-card-sdk)项目和 [hs-script-strategy-sdk](https://github.com/xjw580/hs-script-strategy-sdk) 项目，插件的开发基于提供的这两个SDK，对SDK的使用参考[hs-script-base-card-plugin](https://github.com/xjw580/hs-script-base-card-plugin/tree/4d339b52aa48cf11e2b33e1c4da54e4dd96871f6/src/main/kotlin/club/xiaojiawei/hsscriptbasecard/bean)
2. 阅读 [hs-script-base-card-plugin](https://github.com/xjw580/hs-script-base-card-plugin) 项目



### 卡牌插件开发步骤

> 卡牌插件主要服务于[mcts策略](https://github.com/xjw580/hs-script-base-strategy-plugin/blob/287bd9727d971663dc281c85aa4feda8a0eff421/src/main/kotlin/club/xiaojiawei/hsscriptbasestrategy/strategy/HsMCTSDeckStrategy.kt)，其次是适配卡牌的使用行为

1. 通过此仓库模板创建一个新的仓库
2. 修改新仓库内的  [TemplatePlugin](src\main\kotlin\club\xiaojiawei\cardplugintemplate\TemplatePlugin.kt)
3. `TemplatePlugin`是插件的配置类，在 [club.xiaojiawei.hsscriptcardsdk.CardPlugin](src\main\resources\META-INF\services\club.xiaojiawei.hsscriptcardsdk.CardPlugin) 中注册，注册方式为全限定类名，只有注册了才能被识别
4. `TarCreeper`是卡牌类，在 [club.xiaojiawei.hsscriptcardsdk.CardAction](src\main\resources\META-INF\services\club.xiaojiawei.hsscriptcardsdk.CardAction)  中注册，注册方式为全限定类名，只有注册了才能被识别
5.  对卡牌的适配参考[TarCreeper](src\main\kotlin\club\xiaojiawei\cardplugintemplate\TarCreeper.kt) ，如需适配其他卡牌自行新建新类并继承`CardAction.DefaultCardAction`，然后注册
6. 修改完后可以通过idea打包或执行`mvn clean package`
7. 将生成的jar包放入软件根目录的plugin文件夹下



### 调试

1. 创建完新仓库后复制仓库地址，然后在克隆的[Hearthstone-Script](https://github.com/xjw580/Hearthstone-Script)根目录下执行

   ```tex
   git submodule add 项目clone地址 user-card-plugins/你的项目名
   ```

2. 等clone完毕，在`Hearthstone-Script`的`pom.xml`文件中的`modules`标签里添加你的模块

3. 在`hs-script-app`的`pom.xml`文件中的`dependencies`标签里添加你的插件

4. 这样就不用打成jar包使用了测试了

5. 如果想让更多人知道你的插件，可以在添加git子模块后向[Hearthstone-Script](https://github.com/xjw580/Hearthstone-Script)提PR
