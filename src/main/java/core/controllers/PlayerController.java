package core.controllers;

import core.dto.PlayerDto;
import core.entities.Player;
import core.services.PlayerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.Collection;

/**
 * Created by tommylii on 07/12/2015.
 */
@RestController
@RequestMapping("/players")
public class PlayerController {

    @Inject
    private PlayerService playerService;

    @RequestMapping(path = "", method = RequestMethod.GET)
    public ResponseEntity<Collection<PlayerDto>> getAllPlayers(){
        return new ResponseEntity<>(playerService.getAllPlayers(), HttpStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.PUT, consumes = "application/json")
    public ResponseEntity<PlayerDto> createPlayer(@RequestBody String playerName){
        return new ResponseEntity<>(playerService.createPlayer(playerName), HttpStatus.CREATED);
    }

    @RequestMapping(path = "", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<PlayerDto> updatePlayer(@RequestBody String playerName){
        return new ResponseEntity<>(playerService.createPlayer(playerName),HttpStatus.ACCEPTED);
    }

    @RequestMapping(path = "{playerName}", method = RequestMethod.GET)
    public ResponseEntity<PlayerDto> getPlayerForName(@PathVariable String playerName) {
        return new ResponseEntity<>(playerService.findPlayerByName(playerName),HttpStatus.OK);
    }
}
