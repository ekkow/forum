package com.example.arknightsdemo.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan("com.example.arknightsdemo.mapper")
public class MybatisPlusConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor(DbType.MYSQL);
        paginationInnerInterceptor.setMaxLimit(Long.valueOf(-1));

//        interceptor.addInnerInterceptor(new TenantLineInnerInterceptor(new TenantLineHandler() {
//            @Override
//            public Expression getTenantId() {
//                User user = (User)SecurityUtils.getSubject().getPrincipal();
//                return new LongValue(user.getServiceProviderId());
//            }
//
//            @Override
//            public String getTenantIdColumn() {
//                return "service_provider_id";
//            }
//            // 这是 default 方法,默认返回 false 表示所有表都需要拼多租户条件
//            @Override
//            public boolean ignoreTable(String tableName) {
//                User user = (User)SecurityUtils.getSubject().getPrincipal();
//                if (user == null || user.getRoleId().equals(1L)) {
//                    return true;
//                } else {
//                    List<String> resource = Arrays.asList("user", "role", "permission");
//                    return resource.contains(tableName);
//                }
//            }
//        }));

        interceptor.addInnerInterceptor(paginationInnerInterceptor);
        return interceptor;
    }


}
