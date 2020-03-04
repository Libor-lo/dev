package com.dev.demo.config.dataSources;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;


@Configuration
@MapperScan(basePackages = "com.dev.demo.mapper", sqlSessionFactoryRef = "testSqlSessionFactory")
public class TestDataSourceConfig {

    @Primary
    @Bean(name = "testDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.test")
    public DataSource getLolDateSource() {
        return new DruidDataSource();
    }

    @Bean(name = "testSqlSessionFactory")
    @Primary
    public SqlSessionFactory lolSqlSessionFactory(@Qualifier("testDataSource") DataSource datasource)
            throws Exception {
        MybatisSqlSessionFactoryBean bean = new MybatisSqlSessionFactoryBean();
        bean.setDataSource(datasource);
        bean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/*Mapper.xml"));
        bean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:mapper/mybatis-config.xml"));
        return  bean.getObject();
    }

    @Bean("testSqlSessionTemplate")
    @Primary
        public SqlSessionTemplate lolSqlSessionTemplate(
            @Qualifier("testSqlSessionFactory") SqlSessionFactory sessionFactory) {
        return new SqlSessionTemplate(sessionFactory);
    }
}