package core.repositories;

import core.model.GameRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tommylii on 04/12/2015.
 */
@Repository
public interface GameRecordRepository extends CrudRepository<GameRecord,Long> {
}
