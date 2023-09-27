/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ertu.proje3;

import java.util.ArrayList;

/**
 *
 * @author ergul
 */

public class ErtugrulErgulPosition {
    private int x;
    private int y;
    
    public ErtugrulErgulPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    // A line is created between two points and all the points on the line is returned to the backend
    public static ArrayList<ErtugrulErgulPosition> getPath(ErtugrulErgulPosition first, ErtugrulErgulPosition last) {
        // Eğer x noktaları eşitse bu bir y-doğrusu demektir. y noktaları arasındaki mesafe alınır,
        // mesafe kullanılarak aradaki taşlar doğruya eklenir.
        if (first.getX() == last.getX()) {
            int diff = Math.abs(first.getY() - last.getY());
            int index = Math.max(first.getY(), last.getY());
            ArrayList<ErtugrulErgulPosition> path = new ArrayList<>(diff + 1);
            while (diff >= 0) {
                path.add(new ErtugrulErgulPosition(first.getX(), index - diff));
                diff--;
            }
            return path;
        // If y-axis values are the same, than the line is on x-axis. Distance between x-values are taken
        } else if (first.getY() == last.getY()) {
            int diff = Math.abs(first.getX() - last.getX());
            int index = Math.max(first.getX(), last.getX());
            ArrayList<ErtugrulErgulPosition> path = new ArrayList<>(diff + 1);
            while (diff >= 0) {
                path.add(new ErtugrulErgulPosition(index - diff, first.getY()));
                diff--;
            }
            return path;
        // If values for both axis are different, then it is a x=y line since the board is a square and
        // the game rules don't let other lines happen at all
        } else {
            int diff = Math.abs(first.getX() - last.getX());
            int y_index = Math.max(first.getY(), last.getY());
            int x_index;
            boolean x1_is_lower;
            
            // Upper point's x-axis is checked to see if it is on left compared to the other
            if (y_index == first.getY()) {
                x_index = first.getX();
                x1_is_lower = first.getX() < last.getY();
            } else {
                x_index = last.getX();
                x1_is_lower = last.getX() < first.getX();
            }
            // If it is, then theoretical cursor moves downwards and to the right
            if (x1_is_lower) {
                ArrayList<ErtugrulErgulPosition> path = new ArrayList<>(diff + 1);
                while (diff >= 0) {
                    path.add(new ErtugrulErgulPosition(x_index + diff, y_index - diff));
                    diff--;
                }
                return path;
            // If it isn't, then downwards and to the left
            } else {
                ArrayList<ErtugrulErgulPosition> path = new ArrayList<>(diff + 1);
                while (diff >= 0) {
                    path.add(new ErtugrulErgulPosition(x_index - diff, y_index - diff));
                    diff--;
                }
                return path;
            }
        }
    }
}
