import core.ComponentScanMarker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

/**
 * Created by tommylii on 07/12/2015.
 */
@SpringBootApplication(scanBasePackages = {"config","core"})
public class FootballRestApplication {

    private static Logger LOGGER = Logger.getLogger(FootballRestApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(FootballRestApplication.class, args);
    }


}
