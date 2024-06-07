/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ertu.proje3;

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
    private Turn current_player;
    
    public GameState(Player player1, Player player2) {
        this.black_player = player1;
        this.white_player = player2;
    }
    
    public Turn getCurrentPlayer() {
        return current_player;
    }

    public void setCurrentPlayer(Turn current_player) {
        this.current_player = current_player;
    }

    public Player getWhitePlayer() {
        return white_player;
    }

    public Player getBlackPlayer() {
        return black_player;
    }
    
    
}
