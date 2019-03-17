package ua.oleg.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ua.oleg.entity.Player;
@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
	Player findOneByUsername(String username);

}
