package config;


import core.ComponentScanMarker;
import core.entities.GameRecord;
import core.entities.TeamType;
import core.services.GameRecordService;
import core.services.PlayerService;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Logger;


/**
 * Created by tommylii on 04/12/2015.
 */
@SpringApplicationConfiguration(DataStoreConfig.class)
@ComponentScan(basePackageClasses = {ComponentScanMarker.class})
public class ApplicationConfig {

    private static Logger LOGGER = Logger.getLogger(ApplicationConfig.class.getName());


}
