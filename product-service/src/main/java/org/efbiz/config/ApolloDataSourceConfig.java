package org.efbiz.config;

import javax.sql.DataSource;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

@Configuration
@EnableTransactionManagement
@EnableApolloConfig("TEST2.datasource")
@Log4j2
public class ApolloDataSourceConfig{
    
    @Bean
    @RefreshScope
    public ApolloDataSourceConfigBean javaConfigBean() {
        return new ApolloDataSourceConfigBean();
    }
    
    @SuppressWarnings("unchecked")
    @Bean(name = "defaultDataSource", destroyMethod = "close")
    @Qualifier("defaultDataSource")
    @Primary
    @RefreshScope
    public DataSource defaultDataSource() {
        ApolloDataSourceConfigBean dataSourceConfigBean = javaConfigBean();
        DataSourceBuilder dsb = DataSourceBuilder.create().driverClassName(javaConfigBean().getDriverClassName());
        dsb.url(dataSourceConfigBean.getUrl());
        dsb.username(dataSourceConfigBean.getUsername());
        try {
            dsb.type((Class<? extends DataSource>) Class.forName(dataSourceConfigBean.getType()));
        } catch (ClassNotFoundException e) {
            log.error("初始化数据库连接池失败", e);
        }
        dsb.password(dataSourceConfigBean.getPassword());
        DataSource ds = dsb.build();
        return ds;
    }
    
    @Bean(name = "transactionManager")
    @Primary
    public PlatformTransactionManager defaultTransactionManager(@Qualifier("defaultDataSource") DataSource datasource) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(datasource);
        transactionManager.setGlobalRollbackOnParticipationFailure(false);
        return transactionManager;
    }
}
