/*
 * Copyright 2017-2018 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.micronaut.management.endpoint.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import io.micronaut.context.annotation.AliasFor;
import io.micronaut.context.annotation.Executable;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Produces;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * A method designed to annotate an {@link Endpoint} write operation.
 *
 * @author Graeme Rocher
 * @since 1.0
 */
@Documented
@Retention(RUNTIME)
@Target(ElementType.METHOD)
@Executable
public @interface Write {

    /**
     * @return Description of the operation
     */
    String description() default "";

    /**
     * @return The produced MediaType values. Defaults to application/json
     */
    @AliasFor(annotation = Produces.class, member = "value")
    String[] produces() default MediaType.APPLICATION_JSON;

    /**
     * @return The consumed MediaType for request bodies Defaults to application/json
     */
    @AliasFor(annotation = Consumes.class, member = "value")
    String[] consumes() default MediaType.APPLICATION_JSON;
}
