package core.repositories;

import core.entities.GameRecord;
import core.entities.Player;
import core.entities.PlayerRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by tommylii on 04/12/2015.
 */
@Repository
public interface PlayerRecordRepository extends CrudRepository<PlayerRecord,Long> {

    Collection<PlayerRecord> findByGameRecord(final GameRecord gameRecord);

    Collection<PlayerRecord> findByPlayer(final Player player);

    PlayerRecord findByGameRecordAndPlayer(final GameRecord gameRecord, final Player player);
}
