/*
 *
 * Copyright (c) 2006-2019, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.common.tuple.internal.nonnullable.mapper;

import com.speedment.common.tuple.Tuple13;
import com.speedment.common.tuple.TupleMapper;
import com.speedment.common.tuple.Tuples;
import com.speedment.common.tuple.internal.AbstractTupleMapper;

import java.util.function.Function;

/**
 * An implementation class of a {@link TupleMapper } of degree 13
 * <p>
 * Generated by com.speedment.sources.pattern.tuple.TupleMapperImplPattern
 * 
 * @param <T>   Type of the original object for the mapper to use when creating
 *              a {@code Tuple }
 * @param <T0>  type of element 0
 * @param <T1>  type of element 1
 * @param <T2>  type of element 2
 * @param <T3>  type of element 3
 * @param <T4>  type of element 4
 * @param <T5>  type of element 5
 * @param <T6>  type of element 6
 * @param <T7>  type of element 7
 * @param <T8>  type of element 8
 * @param <T9>  type of element 9
 * @param <T10> type of element 10
 * @param <T11> type of element 11
 * @param <T12> type of element 12
 * 
 * @author Per Minborg
 */
public final class Tuple13MapperImpl<T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> 
extends AbstractTupleMapper<T, Tuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>> 
implements TupleMapper<T, Tuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>> {
    
    /**
     * Constructs a {@link TupleMapper } that can create {@link Tuple13 }.
     * 
     * @param m0  mapper to apply for element 0
     * @param m1  mapper to apply for element 1
     * @param m2  mapper to apply for element 2
     * @param m3  mapper to apply for element 3
     * @param m4  mapper to apply for element 4
     * @param m5  mapper to apply for element 5
     * @param m6  mapper to apply for element 6
     * @param m7  mapper to apply for element 7
     * @param m8  mapper to apply for element 8
     * @param m9  mapper to apply for element 9
     * @param m10 mapper to apply for element 10
     * @param m11 mapper to apply for element 11
     * @param m12 mapper to apply for element 12
     */
    public Tuple13MapperImpl(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5,
            Function<T, T6> m6,
            Function<T, T7> m7,
            Function<T, T8> m8,
            Function<T, T9> m9,
            Function<T, T10> m10,
            Function<T, T11> m11,
            Function<T, T12> m12) {
        super(13);
        set(0, m0);
        set(1, m1);
        set(2, m2);
        set(3, m3);
        set(4, m4);
        set(5, m5);
        set(6, m6);
        set(7, m7);
        set(8, m8);
        set(9, m9);
        set(10, m10);
        set(11, m11);
        set(12, m12);
    }
    
    @Override
    public Tuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> apply(T t) {
        return Tuples.of(
            get0().apply(t),
            get1().apply(t),
            get2().apply(t),
            get3().apply(t),
            get4().apply(t),
            get5().apply(t),
            get6().apply(t),
            get7().apply(t),
            get8().apply(t),
            get9().apply(t),
            get10().apply(t),
            get11().apply(t),
            get12().apply(t)
        );
    }
    
    public Function<T, T0> get0() {
        return getAndCast(0);
    }
    
    public Function<T, T1> get1() {
        return getAndCast(1);
    }
    
    public Function<T, T2> get2() {
        return getAndCast(2);
    }
    
    public Function<T, T3> get3() {
        return getAndCast(3);
    }
    
    public Function<T, T4> get4() {
        return getAndCast(4);
    }
    
    public Function<T, T5> get5() {
        return getAndCast(5);
    }
    
    public Function<T, T6> get6() {
        return getAndCast(6);
    }
    
    public Function<T, T7> get7() {
        return getAndCast(7);
    }
    
    public Function<T, T8> get8() {
        return getAndCast(8);
    }
    
    public Function<T, T9> get9() {
        return getAndCast(9);
    }
    
    public Function<T, T10> get10() {
        return getAndCast(10);
    }
    
    public Function<T, T11> get11() {
        return getAndCast(11);
    }
    
    public Function<T, T12> get12() {
        return getAndCast(12);
    }
}