package com.hhips.core.annotation;

import java.lang.annotation.*;

/**
 * 名称：LogInject<br>
 *
 * 描述：自定义注解（用户注入Logger对象）<br>
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface LogInject {
}