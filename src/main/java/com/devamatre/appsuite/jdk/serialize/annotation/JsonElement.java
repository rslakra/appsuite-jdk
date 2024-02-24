package com.devamatre.appsuite.jdk.serialize.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Rohtash Lakra
 * @created 10/3/19 8:33 AM
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonElement {

    String key() default "";
}
