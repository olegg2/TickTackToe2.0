package ua.oleg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Check;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.oleg.enums.CurrentGameStatus;
import ua.oleg.enums.Piece;
import ua.oleg.enums.PlayerType;

@Entity
@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
//check all later
@Check(constraints = "first_player_piece_code = 'O' or first_player_piece_code = 'X' " +
        "and desk_type = 'COMPUTER' or desk_type = 'PLAYER' " +
        "and desk_status = 'IN_PROGRESS' or desk_status = 'FIRST_PLAYER_HAS_WON' "
        + "or desk_status = 'SECOND_PLAYER_HAS_WON'" +
        "or desk_status = 'TIE' or desk_status = 'WAITINGS_FOR_PLAYER' ")

public class Desk extends BaseEntity{
	@ManyToOne
	@JoinColumn(name = "first_player_id", nullable = false)
	private Player firstPlayer;
	
	@ManyToOne
	@JoinColumn(name = "second_player_id", nullable = true)
	private Player secondPlayer;
	
	@Enumerated(EnumType.STRING)
	private Piece firstPlayerPieceCode;
	
	@Enumerated(EnumType.STRING)
	private CurrentGameStatus currentGameStatus ;

	@Enumerated(EnumType.STRING)
	private PlayerType playerType;

	@Column(name = "created", nullable = false)
	private Date created;
	
}
