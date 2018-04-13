package com.speedment.runtime.field.expression;

import com.speedment.runtime.compute.ToIntNullable;

import java.util.function.ToIntFunction;

/**
 * Specific {@link FieldMapper} implementation that also implements
 * {@link ToIntNullable}.
 *
 * @author Emil Forslund
 * @since  3.1.0
 */
public interface FieldToInt<ENTITY, T>
extends FieldMapper<ENTITY, T, ToIntFunction<T>>,
        ToIntNullable<ENTITY> {}