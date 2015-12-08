package core.controllers;

import core.dto.PlayerDto;
import core.entities.Player;
import core.services.PlayerService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.Collection;

/**
 * Created by tommylii on 07/12/2015.
 */
@RestController
@RequestMapping("/player")
public class PlayerController {

    @Inject
    private PlayerService playerService;

    @RequestMapping(path = "")
    public Collection<PlayerDto> getAllPlayers(){
        Collection<PlayerDto> allPlayers = playerService.getAllPlayers();
        return allPlayers;
    }

    @RequestMapping(path = "{playerName}")
    public PlayerDto createPlayer(@PathVariable String playerName){
        PlayerDto player = playerService.createPlayer(playerName);
        return player;
    }

}
