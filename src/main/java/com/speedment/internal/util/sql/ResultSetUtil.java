/**
 *
 * Copyright (c) 2006-2016, Speedment, Inc. All Rights Reserved.
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
package com.speedment.internal.util.sql;

import com.speedment.db.SqlFunction;
import static com.speedment.util.StaticClassUtil.instanceNotAllowed;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Utility methods for retreiving nullable values from {@code ResultSet}.
 * 
 * @author Emil Forslund
 */
public final class ResultSetUtil {
    
    // Null safe RS getters, must have the same name as ResultSet getters
    public static Object getObject(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getObject(columnName));
    }

    public static Boolean getBoolean(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getBoolean(columnName));
    }

    public static Byte getByte(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getByte(columnName));
    }

    public static Short getShort(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getShort(columnName));
    }

    public static Integer getInt(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getInt(columnName));
    }

    public static Long getLong(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getLong(columnName));
    }

    public static Float getFloat(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getFloat(columnName));
    }

    public static Double getDouble(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getDouble(columnName));
    }

    public static String getString(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getString(columnName));
    }

    public static Date getDate(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getDate(columnName));
    }

    public static Time getTime(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getTime(columnName));
    }

    public static Timestamp getTimestamp(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getTimestamp(columnName));
    }

    public static BigDecimal getBigDecimal(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getBigDecimal(columnName));
    }

    public static Blob getBlob(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getBlob(columnName));
    }

    public static Clob getClob(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getClob(columnName));
    }

    public static Array getArray(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getArray(columnName));
    }

    public static Ref getRef(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getRef(columnName));
    }

    public static URL getURL(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getURL(columnName));
    }

    public static RowId getRowId(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getRowId(columnName));
    }

    public static NClob getNClob(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getNClob(columnName));
    }

    public static SQLXML getSQLXML(final ResultSet resultSet, final String columnName) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getSQLXML(columnName));
    }

    // Null safe RS getters (int), must have the same name as ResultSet getters
    public static Object getObject(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getObject(ordinalPosition));
    }

    public static Boolean getBoolean(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getBoolean(ordinalPosition));
    }

    public static Byte getByte(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getByte(ordinalPosition));
    }

    public static Short getShort(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getShort(ordinalPosition));
    }

    public static Integer getInt(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getInt(ordinalPosition));
    }

    public static Long getLong(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getLong(ordinalPosition));
    }

    public static Float getFloat(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getFloat(ordinalPosition));
    }

    public static Double getDouble(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getDouble(ordinalPosition));
    }

    public static String getString(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getString(ordinalPosition));
    }

    public static Date getDate(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getDate(ordinalPosition));
    }

    public static Time getTime(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getTime(ordinalPosition));
    }

    public static Timestamp getTimestamp(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getTimestamp(ordinalPosition));
    }

    public static BigDecimal getBigDecimal(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getBigDecimal(ordinalPosition));
    }

    public static Blob getBlob(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getBlob(ordinalPosition));
    }

    public static Clob getClob(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getClob(ordinalPosition));
    }

    public static Array getArray(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getArray(ordinalPosition));
    }

    public static Ref getRef(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getRef(ordinalPosition));
    }

    public static URL getURL(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getURL(ordinalPosition));
    }

    public static RowId getRowId(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getRowId(ordinalPosition));
    }

    public static NClob getNClob(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getNClob(ordinalPosition));
    }

    public static SQLXML getSQLXML(final ResultSet resultSet, final int ordinalPosition) throws SQLException {
        return getNullableFrom(resultSet, rs -> rs.getSQLXML(ordinalPosition));
    }
    
    private static <T> T getNullableFrom(ResultSet rs, SqlFunction<ResultSet, T> mapper) throws SQLException {
        final T result = mapper.apply(rs);
        return rs.wasNull() ? null : result;
    }
    
    /**
     * Utility classes should not be instantiated.
     */
    private ResultSetUtil() { instanceNotAllowed(getClass()); }
}
