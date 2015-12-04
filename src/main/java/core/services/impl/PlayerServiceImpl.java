package core.services.impl;

import core.model.Player;
import org.springframework.stereotype.Service;
import core.repositories.PlayerRepository;
import core.services.PlayerService;

import javax.inject.Inject;
import java.util.*;

/**
 * Created by tommylii on 04/12/2015.
 */
@Service
public class PlayerServiceImpl implements PlayerService {

    @Inject
    private PlayerRepository playerRepository;


    public Player createPlayer(String name) {
        return playerRepository.save(new Player(name));
    }

    public Collection<Player> getAllPlayers() {
        ArrayList<Player> playerArrayList = new ArrayList<>();
        playerRepository.findAll().forEach(playerArrayList::add);
        return playerArrayList;
    }
}
