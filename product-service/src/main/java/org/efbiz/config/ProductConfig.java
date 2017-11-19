package org.efbiz.config;

import javax.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.model.ConfigChange;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;

@Component
@Log4j2
@Data
public class ProductConfig{

    @Value("${Version:100}")
    private int Version;
    
    @ApolloConfig("application")
    private Config config; //inject config for namespace application
    
    @PostConstruct
    void initialize() {
      log.info("Version is {}", Version);
      log.info("Keys for config: {}", config.getPropertyNames());
    }

    
    //config change listener for namespace application
    @ApolloConfigChangeListener("application")
    private void someOnChange(ConfigChangeEvent changeEvent) {
      //update injected value of batch if it is changed in Apollo
      if (changeEvent.isChanged("Version")) {
          ConfigChange change = changeEvent.getChange("Version");
          Version = config.getIntProperty("Version", 100);
          log.info("[changeHandler]Change - key: {}, oldValue: {}, newValue: {}, changeType: {}", change.getPropertyName(), change.getOldValue(), change.getNewValue(), change.getChangeType());
      }
    }
    
}
