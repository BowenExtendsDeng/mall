package com.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bowen
 * @since 2022-07-15
 */
@Configuration
@MapperScan("com.mall.mapper")
@EnableTransactionManagement
public class MybatisPlusConfig {
}
