package core.services;

import core.entities.GameRecord;
import core.entities.Player;

/**
 * Created by tommylii on 04/12/2015.
 */
public interface PlayerRecordService {
    void removePlayerFromGame(Player player, GameRecord gameRecord);
}
