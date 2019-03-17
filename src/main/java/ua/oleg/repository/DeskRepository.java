package ua.oleg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import ua.oleg.entity.Desk;
import ua.oleg.enums.CurrentGameStatus;
import ua.oleg.enums.PlayerType;

@Repository
public interface DeskRepository extends  JpaRepository<Desk,Long> {
	List<Desk> findByPlayerTypeAndCurrentGameStatus(PlayerType playerType,
			CurrentGameStatus currentGameStatus);
	List<Desk> findByCurrentGameStatus (CurrentGameStatus currentGameStatus);

}
