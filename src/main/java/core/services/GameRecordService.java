package core.services;

import core.dto.GameRecordDto;
import core.dto.PlayerDto;
import core.entities.GameRecord;
import core.entities.Player;
import core.entities.TeamType;

import java.util.Collection;
import java.util.Date;

/**
 * Created by tommylii on 04/12/2015.
 */
public interface GameRecordService {
    GameRecordDto createGameRecord(final Date date);

    GameRecordDto addPlayersToGameAndTeam(final Collection<PlayerDto> playersByNames, final TeamType team, final
                                       GameRecordDto gameRecord);
}
