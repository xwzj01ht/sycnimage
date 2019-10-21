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
@MapperScan(basePackages = "cn.ac.iie.sycnimage.mapper.dglance", sqlSessionFactoryRef = "dglanceSqlSessionFactory")
public class DGlanceConfigration {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dglance")
    @Primary
    public DataSource dglanceDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "sglanceSqlSessionFactory")
    @Primary
    public SqlSessionFactoryBean sqlSessionFactory(@Qualifier("dglanceDataSource") DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        return sessionFactory;
    }
}
