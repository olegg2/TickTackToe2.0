package ua.oleg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
public class Movement extends BaseEntity {

	@ManyToOne
	@JoinColumn(name = "desk_id")
	private Desk desk;
	
	@ManyToOne
	@JoinColumn(name = "player_id", nullable = true)
	private Player player;
	
	@Column(name = "board_row", nullable = false)
	private int boardRow;
	
	@Column(name = "board_column",nullable = false)
	private int boardColumn;
	
	@Column(name = "created",nullable = false)
	private Date created;
}
