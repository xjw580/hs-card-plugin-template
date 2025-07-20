package club.xiaojiawei.cardplugintemplate

import club.xiaojiawei.hsscriptcardsdk.CardPlugin
import club.xiaojiawei.hsscriptpluginsdk.config.PluginScope

/**
 * @author 肖嘉威
 * @date 2024/9/8 14:57
 */
class TemplatePlugin : CardPlugin {
    override fun description(): String = "模板描述"

    override fun author(): String = "插件作者"

    override fun version(): String = VersionInfo.VERSION

    override fun id(): String = "插件的唯一id"

    override fun name(): String = "插件名字"

    /**
     * 插件主页
     */
    override fun homeUrl(): String = "https://github.com/xjw580/hs-card-plugin-template.git"

    /**
     * 使用的卡牌SDK版本
     */
    override fun cardSDKVersion(): String? = if (VersionInfo.CARD_SDK_VERSION_USED.endsWith("}")) null else VersionInfo.CARD_SDK_VERSION_USED

    /**
     * 使用的策略SDK版本
     */
    override fun strategySDKVersion(): String? = if (VersionInfo.STRATEGY_SDK_VERSION_USED.endsWith("}")) null else VersionInfo.STRATEGY_SDK_VERSION_USED

    /**
     * 插件可见范围
     */
    override fun pluginScope(): Array<String> = PluginScope.PUBLIC
}