package com.speedment.runtime.typemapper.time;

import com.speedment.runtime.typemapper.AbstractTypeMapperTest;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static com.speedment.runtime.typemapper.TypeMapper.Category;
import static com.speedment.runtime.typemapper.TypeMapper.Ordering;

final class DateToLocalDateMapperTest extends AbstractTypeMapperTest<Date, LocalDate, DateToLocalDateMapper> {

    DateToLocalDateMapperTest() {
        super(
            Date.class,
            LocalDate.class,
            Category.COMPARABLE,
            Ordering.RETAIN,
            DateToLocalDateMapper::new
        );
    }

    @Override
    protected Map<Date, LocalDate> testVector() {
        Map<Date, LocalDate> map = new HashMap<>();
        return map;
    }
}