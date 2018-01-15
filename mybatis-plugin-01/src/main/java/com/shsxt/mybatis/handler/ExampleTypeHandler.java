package com.shsxt.mybatis.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 自定义类型处理器
 */
@MappedJdbcTypes(JdbcType.VARCHAR)
public class ExampleTypeHandler extends BaseTypeHandler<String> {

    public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter);

        System.out.println("-------》 进入自定义的类型处理器 setNonNullParameter");

    }

    public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
        System.out.println("-------》 进入自定义的类型处理器 getNullableResult");
        return rs.getString(columnName);
    }

    public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        System.out.println("-------》 进入自定义的类型处理器 getNullableResult");
        return rs.getString(columnIndex);
    }

    public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        System.out.println("-------》 进入自定义的类型处理器 getNullableResult");
        return cs.getString(columnIndex);
    }
}
