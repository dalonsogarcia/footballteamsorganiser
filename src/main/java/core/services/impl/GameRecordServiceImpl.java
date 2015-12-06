package core.services.impl;

import core.model.GameRecord;
import core.model.Player;
import core.model.PlayerRecord;
import core.model.TeamType;
import core.repositories.PlayerRecordRepository;
import org.springframework.stereotype.Service;
import core.repositories.GameRecordRepository;
import core.services.GameRecordService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Date;

/**
 * Created by tommylii on 04/12/2015.
 */
@Service
@Transactional
public class GameRecordServiceImpl implements GameRecordService{

    @Inject
    private GameRecordRepository gameRecordRepository;

    @Inject
    private PlayerRecordRepository playerRecordRepository;

    @Override
    public GameRecord createGameRecord(final Date date) {
        return gameRecordRepository.save(new GameRecord(date));
    }

    @Override
    public GameRecord addPlayersToGameAndTeam(final Collection<Player> playersByNames, final TeamType team,
                                              final GameRecord gameRecord) {
        playersByNames.forEach(player -> playerRecordRepository.save(new PlayerRecord(player,gameRecord, team)));
        return gameRecordRepository.findOne(gameRecord.getId());
    }
}
