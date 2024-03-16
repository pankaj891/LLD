package com.inn.snakeladderlld;

import com.inn.snakeladderlld.board.Board;
import com.inn.snakeladderlld.dice.Dice;
import com.inn.snakeladderlld.enemies.Enemies;
import com.inn.snakeladderlld.enemies.Ladder;
import com.inn.snakeladderlld.enemies.Snake;
import com.inn.snakeladderlld.player.Player;

public class Runner {

	public static void main(String[] args) {
		Dice dice = Dice.getDice(6);
		Board board = Board.getBoard(10, dice);
		Enemies snakeone = new Snake(54,16);
		Enemies snaketwo = new Snake(88,66);
		Enemies ladderone = new Ladder(9,44);
		Enemies laddertwo = new Ladder(44,99);
		board.setPiece(snakeone);
		board.setPiece(snaketwo);
		board.setPiece(ladderone);
		board.setPiece(laddertwo);
		Player playerone = new Player("pankaj",0);
		Player playertwo = new Player("Rahul",0);
		board.setPlayer(playerone);
		board.setPlayer(playertwo);
		board.play();
	}

}
