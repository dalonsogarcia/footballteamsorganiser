package core.services.impl;

import core.entities.Player;
import org.springframework.stereotype.Service;
import core.repositories.PlayerRepository;
import core.services.PlayerService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.*;
import java.util.logging.Logger;

/**
 * Created by tommylii on 04/12/2015.
 */
@Service
@Transactional
public class PlayerServiceImpl implements PlayerService {

    private static Logger LOGGER = Logger.getLogger(PlayerServiceImpl.class.getName());

    @Inject
    private PlayerRepository playerRepository;


    public Player createPlayer(final String name) {
        LOGGER.info("Creating player with name : " + name);
        return playerRepository.save(new Player(name));
    }

    public Collection<Player> getAllPlayers() {
        ArrayList<Player> playerArrayList = new ArrayList<>();
        playerRepository.findAll().forEach(playerArrayList::add);
        return playerArrayList;
    }

    @Override
    public Collection<Player> findPlayersByName(final String name) {
        return playerRepository.findByName(name);
    }

    @Override
    public Collection<Player> findPlayersByNames(Collection<String> playerNames) {
        Collection<Player> players = new ArrayList<>();
        playerNames.forEach(name -> players.addAll(playerRepository.findByName(name)));
        return players;
    }
}
