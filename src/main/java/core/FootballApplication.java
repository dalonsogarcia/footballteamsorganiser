package core;

import config.ApplicationConfig;
import core.entities.GameRecord;
import core.entities.TeamType;
import core.services.GameRecordService;
import core.services.PlayerRecordService;
import core.services.PlayerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Logger;

/**
 * Created by tommylii on 06/12/2015.
 */
public class FootballApplication {

    private final static Logger LOGGER = Logger.getLogger(FootballApplication.class.getName());

    @Inject
    private PlayerService playerService;

    @Inject
    private GameRecordService gameRecordService;

    @Inject
    private PlayerRecordService playerRecordService;

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
        LOGGER.info("CREATING GAME RECORD");
        GameRecord gameRecord = gameRecordService.createGameRecord(new Date());
        LOGGER.info("GAME RECORD : " + Long.toString(gameRecord.getId().longValue()));
        LOGGER.info("ADDING PLAYERS TO TEAM");
        gameRecordService.addPlayersToGameAndTeam(playerService.findPlayersByNames(Arrays.asList("tommy", "tommy1",
                "tommy2")), TeamType.TEAM_1,gameRecord);
    }

}
