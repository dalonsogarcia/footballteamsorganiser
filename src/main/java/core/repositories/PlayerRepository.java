package core.repositories;

import core.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by tommylii on 04/12/2015.
 */
@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

    Collection<Player> findByName(String name);

}
