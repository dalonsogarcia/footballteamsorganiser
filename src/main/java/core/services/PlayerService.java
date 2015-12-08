package core.services;

import core.dto.PlayerDto;
import core.entities.Player;

import java.util.Collection;

/**
 * Created by tommylii on 04/12/2015.
 */
public interface PlayerService {

    PlayerDto createPlayer(final String name);

    Collection<PlayerDto> getAllPlayers();

    Collection<PlayerDto> findPlayersByName(final String name);

    Collection<PlayerDto> findPlayersByNames(final Collection<String> playerNames);

    PlayerDto findById(final Long id);
}
