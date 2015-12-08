package core.services.impl;

import core.dto.GameRecordDto;
import core.dto.PlayerDto;
import core.entities.GameRecord;
import core.entities.Player;
import core.entities.PlayerRecord;
import core.entities.TeamType;
import core.repositories.PlayerRecordRepository;
import core.repositories.PlayerRepository;
import core.services.PlayerService;
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

    @Inject
    private PlayerRepository playerRepository;

    @Override
    public GameRecordDto createGameRecord(final Date date) {
        return gameRecordRepository.save(new GameRecord(date)).toGameRecordDto();
    }

    @Override
    public GameRecordDto addPlayersToGameAndTeam(final Collection<PlayerDto> playersByNames, final TeamType team,
                                              final GameRecordDto gameRecord) {
        playersByNames.forEach(player ->
            playerRecordRepository.save(new PlayerRecord(playerRepository.findOne(player.getId()),
                    gameRecordRepository.findOne(gameRecord.getId()), team)));
        return gameRecordRepository.findOne(gameRecord.getId()).toGameRecordDto();
    }
}
