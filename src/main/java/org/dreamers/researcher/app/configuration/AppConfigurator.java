package org.dreamers.researcher.app.configuration;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Yaseen on 7/29/2017.
 */
@Import({AppConfiguration.class})
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "org.dreamers.researcher")
public class AppConfigurator {
    @Bean
    public PropertyPlaceholderConfigurer getPropertyPlaceholderConfigurer(){
        PropertyPlaceholderConfigurer propertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer();
        propertyPlaceholderConfigurer.setLocation(new ClassPathResource("local.properties"));
        propertyPlaceholderConfigurer.setIgnoreUnresolvablePlaceholders(true);
        return propertyPlaceholderConfigurer;
    }
}
