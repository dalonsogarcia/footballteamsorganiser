package config;

import core.FootballApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * Created by tommylii on 04/12/2015.
 */
@Configuration
@Import({DataStoreConfig.class})
@ComponentScan(basePackages = {"core.repositories","core.services","core.controllers"})
public class ApplicationConfig {

    @Bean
    public FootballApplication footballApplication() {
        return new FootballApplication();
    }

}
