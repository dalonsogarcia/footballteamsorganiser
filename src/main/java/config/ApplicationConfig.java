package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by tommylii on 04/12/2015.
 */
@Configuration
@Import({DataStoreConfig.class})
@ComponentScan(basePackages = "core")
public class ApplicationConfig {

}
