package core.services;

import core.entities.GameRecord;
import core.entities.Player;
import core.entities.TeamType;

import java.util.Collection;
import java.util.Date;

/**
 * Created by tommylii on 04/12/2015.
 */
public interface GameRecordService {
    GameRecord createGameRecord(final Date date);

    GameRecord addPlayersToGameAndTeam(final Collection<Player> playersByNames, final TeamType team, final
                                       GameRecord gameRecord);
}
