package com.shsxt.mybatis.plugin;

import org.apache.ibatis.javassist.bytecode.analysis.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

/**
 * 自定义的插件
 */
@Intercepts({
        @Signature(
                type=Executor.class, // 拦截执行器
                method =  "query",
                args={MappedStatement.class,Object.class,RowBounds.class,ResultHandler.class}
        )
})
public class ExamplePlugin  implements Interceptor {

    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("intercept .......");
        return invocation.proceed();// 拦截执行
    }

    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    public void setProperties(Properties properties) {
        System.out.println(properties.get("hello"));
    }
}
