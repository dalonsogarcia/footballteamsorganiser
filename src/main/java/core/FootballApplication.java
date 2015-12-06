package core;

import config.ApplicationConfig;
import core.model.Player;
import core.services.PlayerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.inject.Inject;
import java.util.Collection;
import java.util.logging.Logger;

/**
 * Created by tommylii on 06/12/2015.
 */
public class FootballApplication {

    private final static Logger LOGGER = Logger.getLogger(FootballApplication.class.getName());

    @Inject
    private PlayerService playerService;

    public static void main (String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        final FootballApplication footballApplication = context.getBean(FootballApplication.class);
        footballApplication.run();
    }

    public void run() {
        LOGGER.info("CREATING PLAYER");
        playerService.createPlayer("tommy");
        LOGGER.info("FETCHING ALL PLAYERS");
        playerService.getAllPlayers().forEach(player -> System.out.println(player.getId() + ", " + player.getName()));
        LOGGER.info("CREATING PLAYER");
        playerService.createPlayer("tommy1");
        LOGGER.info("CREATING PLAYER");
        playerService.createPlayer("tommy2");
        LOGGER.info("CREATING PLAYER");
        playerService.createPlayer("tommy3");
        LOGGER.info("FETCHING ALL PLAYERS");
        playerService.getAllPlayers().forEach(player -> System.out.println(player.getId() + ", " + player.getName()));
        LOGGER.info("FINDING PLAYER");
        playerService.findPlayersByName("tommy2").forEach(player -> System.out.println(player.getId() + ", " + player.getName()));
    }

}
