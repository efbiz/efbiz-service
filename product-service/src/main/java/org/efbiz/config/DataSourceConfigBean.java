package org.efbiz.config;

import javax.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;
import org.efbiz.constant.DataSourceConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import com.ctrip.framework.apollo.model.ConfigChange;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;

/**
 * @author Joni
 */
@ConfigurationProperties()
@Log4j2
@RefreshScope
public class DataSourceConfigBean{
    
    private String  username;
    private String  url;
    private String  password;
    private String  type;
    private String  driverClassName;
    private Integer maximumPoolSize;
    @Autowired
    private  org.springframework.cloud.context.scope.refresh.RefreshScope refreshScope;
    
    @PostConstruct
    private void init() {
        log.info("ConfigurationProperties datasource - userName: {}, password: {}, url: {},type :{}", username, password, url, type);
    }
    
    public void setUsername(String userName) {
        this.username = userName;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getUrl() {
        return url;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getType() {
        return type;
    }
    
    public String getDriverClassName() {
        return driverClassName;
    }
    
    public Integer getMaximumPoolSize() {
        return maximumPoolSize;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
    
    public void setMaximumPoolSize(Integer maximumPoolSize) {
        this.maximumPoolSize = maximumPoolSize;
    }
    
    @ApolloConfigChangeListener({
            "application", "TEST2.database" })
    private void changeHandler(ConfigChangeEvent changeEvent) {
        log.info("[changeHandler]Changes for namespace {}", changeEvent.getNamespace());
        for (String key : changeEvent.changedKeys()) {
            ConfigChange change = changeEvent.getChange(key);
            if (DataSourceConstant.TYPE.equals(key)) {
                this.type = change.getNewValue();
            } else if (DataSourceConstant.DRIVERCLASSNAME.equals(key)) {
                this.driverClassName = change.getNewValue();
            } else if (DataSourceConstant.PASSWORD.equals(key)) {
                this.password = change.getNewValue();
            } else if (DataSourceConstant.USERNAME.equals(key)) {
                this.username = change.getNewValue();
            } else if (DataSourceConstant.URL.equals(key)) {
                this.url = change.getNewValue();
            }
            log.info("[changeHandler]Change - key: {}, oldValue: {}, newValue: {}, changeType: {}", change.getPropertyName(), change.getOldValue(), change.getNewValue(), change.getChangeType());
        }
        if(changeEvent.changedKeys().contains(DataSourceConstant.TYPE) 
            ||changeEvent.changedKeys().contains(DataSourceConstant.DRIVERCLASSNAME)
            ||changeEvent.changedKeys().contains(DataSourceConstant.PASSWORD)
            ||changeEvent.changedKeys().contains(DataSourceConstant.USERNAME)
            ||changeEvent.changedKeys().contains(DataSourceConstant.URL)
         ){
            refreshScope.refresh("defaultDataSource");    
        }
        
    }
    
}
