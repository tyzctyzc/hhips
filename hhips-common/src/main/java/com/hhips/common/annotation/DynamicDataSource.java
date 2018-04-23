package com.hhips.common.annotation;

import java.lang.annotation.*;

/**
 * 名称：DynamicDataSource<br>
 * <p>
 * 描述：动态数据源切换注解（默认切换扩展数据源）<br>
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DynamicDataSource {

    /**
     * 需要切换的数据源名称<br>
     *
     * @return DataSourceName
     */
    String value() default "extendDataSource";
}
