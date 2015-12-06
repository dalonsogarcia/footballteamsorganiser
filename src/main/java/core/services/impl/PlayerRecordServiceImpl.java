package core.services.impl;

import core.entities.GameRecord;
import core.entities.Player;
import core.entities.PlayerRecord;
import core.repositories.PlayerRecordRepository;
import org.springframework.stereotype.Service;
import core.repositories.PlayerRepository;
import core.services.PlayerRecordService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.Collection;

/**
 * Created by tommylii on 04/12/2015.
 */
@Service
@Transactional
public class PlayerRecordServiceImpl implements PlayerRecordService {

    @Inject
    private PlayerRecordRepository playerRecordRepository;

    @Override
    public void removePlayerFromGame(final Player player, final GameRecord gameRecord) {
        PlayerRecord playerRecord = playerRecordRepository.findByGameRecordAndPlayer(gameRecord, player);
        playerRecordRepository.delete(playerRecord);
    }
}
