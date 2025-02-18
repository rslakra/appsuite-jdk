package com.rslakra.appsuite.jdk.serialize.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Add meta-annotation to specify the scope and the target has runtime visibility, and we can apply it to types
 * (classes).
 *
 * @author Rohtash Lakra
 * @created 10/2/19 6:01 PM
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface JsonSerializable {

}
