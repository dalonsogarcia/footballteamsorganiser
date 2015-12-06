package core.services;

import core.model.GameRecord;
import core.model.Player;
import core.model.TeamType;

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
