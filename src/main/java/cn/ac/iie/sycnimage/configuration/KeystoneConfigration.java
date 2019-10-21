package cn.ac.iie.sycnimage.configuration;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * Created by hongtao on 2019/10/21.
 */

@Configuration
@MapperScan(basePackages = "cn.ac.iie.sycnimage.mapper.keystone", sqlSessionFactoryRef = "keystoneSqlSessionFactory")
public class KeystoneConfigration {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.keystone")
    public DataSource keystoneDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "keystoneSqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactory(@Qualifier("keystoneDataSource") DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        return sessionFactory;
    }
}
