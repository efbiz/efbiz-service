package org.efbiz.config;

import java.util.Collections;
import java.util.List;
import javax.annotation.PostConstruct;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;

@Component
@Primary
@EnableApolloConfig("TEST2.eureka")
@Data
@EqualsAndHashCode(callSuper = false)
@ConfigurationProperties(prefix = "eureka.client")
@Log4j2
public class ApolloEurekaClientConfig extends EurekaClientConfigBean{
    private String defaultZone;
    private String defaultUrl;
    private boolean fetchRegistry;
    private boolean registerWithEureka;
    private static final String LIST_SEPARATOR = ",";
    // TimeUnit: second
    
    protected Splitter splitter = Splitter.on(LIST_SEPARATOR).omitEmptyStrings().trimResults();
    @PostConstruct
    private void init() {
        log.info("ConfigurationProperties defaultZone : {}", defaultZone);
    }
    
    /**
     * Assert only one zone: defaultZone, but multiple environments.
     */
    public List<String> getEurekaServerServiceUrls(String myZone) {
        if (Strings.isNullOrEmpty(defaultUrl)) {
            return Collections.emptyList();
        }
        List<String> urls = splitter.splitToList(defaultUrl);
        return CollectionUtils.isEmpty(urls) ? super.getEurekaServerServiceUrls(myZone) : urls;
    }
    
}
