package com.inn.snakeladderlld.board;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import com.inn.snakeladderlld.dice.Dice;
import com.inn.snakeladderlld.enemies.Enemies;
import com.inn.snakeladderlld.enemies.Ladder;
import com.inn.snakeladderlld.enemies.Snake;
import com.inn.snakeladderlld.player.Player;

public class Board {

	private Map<Integer, Enemies> snake = new HashMap<>();
	private Map<Integer, Enemies> ladder = new HashMap<>();
	private Queue<Player> playerQueue = new LinkedList<>();
	private final int size;
	private static Board board = null;
	private Dice dice = null;

	private Board(int size,Dice dice) {
		this.size = size * size;
		this.dice = dice;
	}

	public static Board getBoard(int size,Dice dice) {
		if (Board.board == null)
			Board.board = new Board(size,dice);
		return Board.board;
	}

	public void setPiece(Enemies piece) {
		if (piece instanceof Snake) {
			assert piece.getStart() > this.size : "wrong start";
			this.snake.put(piece.getStart(), piece);
		} else if (piece instanceof Ladder) {
			assert piece.getStart() > this.size : "wrong start";
			this.ladder.put(piece.getStart(), piece);
		}
	}

	public void setPlayer(Player player) {
		assert player == null : "please provide player";
		this.playerQueue.add(player);
	}

	public void play() {
		assert this.ladder.size()==0 && this.snake.size()==0 && this.playerQueue.size()==0:"please initialize game first!!";
		while(true) {
			Player player = this.playerQueue.poll();
			System.out.println(player.getName()+" Chance...");
			int number = this.dice.getNumber();
			System.out.println("Dice Rolling : "+number);
			player.move(number);
			if (player.getPosition()>=this.size) {
				System.out.println(player.getName()+" Win!!!");
				break;
			}
			if (this.snake.get(player.getPosition())!=null) {
				Enemies enemies = this.snake.get(player.getPosition());
				player.setPosition(enemies.getEnd());
			} else if (this.ladder.get(player.getPosition())!=null) {
				Enemies enemies = this.ladder.get(player.getPosition());
				player.setPosition(enemies.getEnd());
			}
			this.playerQueue.add(player);
		}
	}
}
