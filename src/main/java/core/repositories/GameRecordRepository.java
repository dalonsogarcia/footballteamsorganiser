package core.repositories;

import core.entities.GameRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tommylii on 04/12/2015.
 */
@Repository("gameRecordRepository")
public interface GameRecordRepository extends CrudRepository<GameRecord,Long> {

}
