/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ertu.proje3;

import com.sun.source.tree.WhileLoopTree;

/**
 *
 * @author ergul
 */
public class GameState {
    enum Turn {
        BLACK, WHITE
    };
    
    private Player white_player;
    private Player black_player;
    private int white_player_score;
    private int black_player_score;
    private Turn current_player = Turn.BLACK;
    
    public GameState(Player player1, Player player2) {
        this.black_player = player1;
        this.white_player = player2;
    }

    public int getWhitePlayerSscore() {
        return white_player_score;
    }

    public void setWhitepPlayerScore(int white_player_score) {
        this.white_player_score = white_player_score;
    }

    public int getBlackPlayerScore() {
        return black_player_score;
    }

    public void setBlackPlayerScore(int black_player_score) {
        this.black_player_score = black_player_score;
    }

    public Player getWhitePlayer() {
        return white_player;
    }

    public void setWhitePlayer(Player white_player) {
        this.white_player = white_player;
    }

    public Player getBlackPlayer() {
        return black_player;
    }

    public void setBlackPlayer(Player black_player) {
        this.black_player = black_player;
    }

    public Turn getCurrentPlayer() {
        return current_player;
    }

    public void setCurrentPlayer(Turn current_player) {
        this.current_player = current_player;
    }
    
    
}
