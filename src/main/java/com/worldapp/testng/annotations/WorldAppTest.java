package com.worldapp.testng.annotations;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.METHOD;

@Retention(value = RetentionPolicy.RUNTIME)
@Target({METHOD})
public @interface WorldAppTest {

    /**
     * Annotation parameters
     * */

    String description();

    int version();

    int threads() default 1;

    boolean enabled() default true;

}
