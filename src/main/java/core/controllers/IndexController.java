package core.controllers;

import core.dto.GameRecordDto;
import core.dto.PlayerDto;
import core.entities.TeamType;
import core.services.GameRecordService;
import core.services.PlayerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Logger;

/**
 * Created by tommylii on 07/12/2015.
 */
@RestController
public class IndexController {

    private final static Logger LOGGER = Logger.getLogger(IndexController.class.getName());

    @Inject
    private PlayerService playerService;

    @Inject
    private GameRecordService gameRecordService;

    @RequestMapping("")
    @ResponseBody
    public String createPlayers() {
        LOGGER.info("Received request");
        LOGGER.info("CREATING PLAYER");
        playerService.createPlayer("tommy");
        LOGGER.info("FETCHING ALL PLAYERS");
        playerService.getAllPlayers().forEach(player -> System.out.println(player.getName() + ", " + player.getName()));
        LOGGER.info("CREATING PLAYER");
        playerService.createPlayer("tommy1");
        LOGGER.info("CREATING PLAYER");
        playerService.createPlayer("tommy2");
        LOGGER.info("CREATING PLAYER");
        playerService.createPlayer("tommy3");
        LOGGER.info("FETCHING ALL PLAYERS");
        playerService.getAllPlayers().forEach(player -> System.out.println(player.getName() + ", " + player.getName()));
        LOGGER.info("FINDING PLAYER");
        PlayerDto playerByName = playerService.findPlayerByName("tommy2");
        LOGGER.info("CREATING GAME RECORD");
        GameRecordDto gameRecord = gameRecordService.createGameRecord(new Date());
        LOGGER.info("GAME RECORD : " + Long.toString(gameRecord.getId().longValue()));
        LOGGER.info("ADDING PLAYERS TO TEAM");
        gameRecordService.addPlayersToGameAndTeam(playerService.findPlayersByNames(Arrays.asList("tommy", "tommy1",
                "tommy2")), TeamType.TEAM_1,gameRecord);
        return "Data created";
    }

}
