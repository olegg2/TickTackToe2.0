package ua.oleg.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ua.oleg.entity.Desk;
import ua.oleg.entity.Movement;
import ua.oleg.entity.Player;
@Repository
public interface MovementRepository extends CrudRepository<Movement,Long> {
	List<Movement> findByDesk(Desk desk);
	List<Movement> findByDeskAndPlayer(Desk desk,Player player);
	int countByDeskAndPlayer(Desk desk, Player player);
}
