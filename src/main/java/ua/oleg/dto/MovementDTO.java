package ua.oleg.dto;

import java.util.Date;

import ua.oleg.enums.CurrentGameStatus;
import ua.oleg.enums.Piece;

public class MovementDTO {
	private int boardColumn;
    private int boardRow;
    private Date created;
    private String userName;
    private CurrentGameStatus gameStatus;
    private Piece playerPieceCode;
}
