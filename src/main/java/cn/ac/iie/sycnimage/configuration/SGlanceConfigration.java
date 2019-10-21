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
 * Created by hongtao on 2019/10/18.
 */

@Configuration
@MapperScan(basePackages = "cn.ac.iie.sycnimage.mapper.sglance", sqlSessionFactoryRef = "sglanceSqlSessionFactory")
public class SGlanceConfigration {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.sglance")
    @Primary
    public DataSource sglanceDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "sglanceSqlSessionFactory")
    @Primary
    public SqlSessionFactoryBean sqlSessionFactory(@Qualifier("sglanceDataSource") DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        return sessionFactory;
    }
}
