package core.services;

import core.entities.Player;

import java.util.Collection;

/**
 * Created by tommylii on 04/12/2015.
 */
public interface PlayerService {

    Player createPlayer(final String name);

    Collection<Player> getAllPlayers();

    Collection<Player> findPlayersByName(final String name);

    Collection<Player> findPlayersByNames(final Collection<String> playerNames);
}
