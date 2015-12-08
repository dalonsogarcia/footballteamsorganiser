package core.services.impl;

import core.dto.PlayerDto;
import core.entities.Player;
import org.springframework.stereotype.Service;
import core.repositories.PlayerRepository;
import core.services.PlayerService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Created by tommylii on 04/12/2015.
 */
@Service
@Transactional
public class PlayerServiceImpl implements PlayerService {

    private static Logger LOGGER = Logger.getLogger(PlayerServiceImpl.class.getName());

    @Inject
    private PlayerRepository playerRepository;

    @Override
    public PlayerDto createPlayer(final String name) {
        LOGGER.info("Creating player with name : " + name);
        return playerRepository.save(new Player(name)).toPlayerDto();
    }

    @Override
    public Collection<PlayerDto> getAllPlayers() {
        ArrayList<PlayerDto> playerArrayList = new ArrayList<>();
        playerRepository.findAll().forEach(player -> playerArrayList.add(player.toPlayerDto()));
        return playerArrayList;
    }

    @Override
    public Collection<PlayerDto> findPlayersByName(final String name) {
        return playerRepository.findByName(name)
                .stream().map(Player::toPlayerDto).collect(Collectors.toList());
    }

    @Override
    public Collection<PlayerDto> findPlayersByNames(Collection<String> playerNames) {
        Collection<PlayerDto> players = new ArrayList<>();
        playerNames.forEach(name -> players.addAll(playerRepository.findByName(name).stream().map
                (Player::toPlayerDto).collect(Collectors.toList())));
        return players;
    }

    @Override
    public PlayerDto findById(Long id) {
        return playerRepository.findOne(id).toPlayerDto();
    }
}
