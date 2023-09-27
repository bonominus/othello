/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ertu.proje3;

/**
 *
 * @author ergul
 */

public class ErtugrulErgulScore implements Comparable<ErtugrulErgulScore>{
    private String username;
    private int score;
    private String unique_id;

    public ErtugrulErgulScore(String username, int score, String unique_id) {
        this.username = username;
        this.score = score;
        this.unique_id = unique_id;
    }
    
    // Comparable<> is implemented to sort the scores by descending order
    @Override
    public int compareTo(ErtugrulErgulScore o) {
        if (this.score < o.getScore()) {
            return -1;
        } else if (this.score == o.getScore()) {
            return 0;
        } else {
            return 1;
        }
    }
        
    public String getUsername() {
        return username;
    }

    public int getScore() {
        return score;
    }

    public String getUniqueId() {
        return unique_id;
    }
}
