package core.repositories;

import core.model.GameRecord;
import core.model.Player;
import core.model.PlayerRecord;
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

    Collection<PlayerRecord> findByGameRecordAndPlayer(final GameRecord gameRecord, final Player player);
}
