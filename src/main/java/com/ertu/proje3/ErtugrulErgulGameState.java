/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ertu.proje3;

/**
 *
 * @author ergul
 */
public class ErtugrulErgulGameState {
    enum Turn {
        BLACK, WHITE
    };
    
    private ErtugrulErgulPlayer white_player;
    private ErtugrulErgulPlayer black_player;
    private Turn current_player;
    
    public ErtugrulErgulGameState(ErtugrulErgulPlayer player1, ErtugrulErgulPlayer player2) {
        this.black_player = player1;
        this.white_player = player2;
    }
    
    public Turn getCurrentPlayer() {
        return current_player;
    }

    public void setCurrentPlayer(Turn current_player) {
        this.current_player = current_player;
    }

    public ErtugrulErgulPlayer getWhitePlayer() {
        return white_player;
    }

    public ErtugrulErgulPlayer getBlackPlayer() {
        return black_player;
    }
    
    
}
