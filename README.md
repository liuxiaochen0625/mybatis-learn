# mybatis-learn
mybatis系统学习

### mybatis懒加载

```
<settings>
        <!-- 打开延迟加载的开关 -->
        <setting name="lazyLoadingEnabled" value="true" />
        <!-- 将积极加载改为消息加载即按需加载 -->
        <setting name="aggressiveLazyLoading" value="false" />
        <!-- 如果上面两个配置没有效果，则需要添加第三个配置 -->
        <setting name="lazyLoadTriggerMethods" value=""/>
</settings>

```
