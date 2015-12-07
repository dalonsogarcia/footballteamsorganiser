package core.controllers;

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

    @RequestMapping(path = "", method = RequestMethod.GET)
    public Collection<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @RequestMapping(path = "{playerName}", method = RequestMethod.GET)
    public Player getAllPlayers(@PathVariable String playerName){
        return playerService.createPlayer(playerName);
    }

}
