package core.repositories;

import core.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tommylii on 04/12/2015.
 */
@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

    Player findByName(String name);

}
