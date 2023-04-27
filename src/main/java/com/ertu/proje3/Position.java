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
public class Position {
    private int x;
    private int y;
    
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public static Position getPosition(SquareButton[][] buttons, SquareButton button) {
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[0].length; j++) {
                if (buttons[i][j].equals(button)) {
                    return new Position(i, j);
                }
            }
        }       
        return null;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public static ArrayList<Position> getPath(Position first, Position last) {
        if (first.getX() == last.getX()) {
            int diff = Math.abs(first.getY() - last.getY());
            int index = Math.max(first.getY(), last.getY());
            ArrayList<Position> path = new ArrayList<>(diff + 1);
            while (diff >= 0) {
                path.add(new Position(first.getX(), index - diff));
                diff--;
            }
            return path;
        } else if (first.getY() == last.getY()) {
            int diff = Math.abs(first.getX() - last.getX());
            int index = Math.max(first.getX(), last.getX());
            ArrayList<Position> path = new ArrayList<>(diff + 1);
            while (diff >= 0) {
                path.add(new Position(index - diff, first.getY()));
                diff--;
            }
            return path;
        } else {
            int diff = Math.abs(first.getX() - last.getX());
            int y_index = Math.max(first.getY(), last.getY());
            int x_index;
            boolean x1_is_lower;
            
            if (y_index == first.getY()) {
                x_index = first.getX();
                x1_is_lower = first.getX() < last.getY();
            } else {
                x_index = last.getX();
                x1_is_lower = last.getX() < first.getX();
            }
            
            if (x1_is_lower) {
                ArrayList<Position> path = new ArrayList<>(diff + 1);
                while (diff >= 0) {
                    path.add(new Position(x_index + diff, y_index - diff));
                    diff--;
                }
                return path;
            } else {
                ArrayList<Position> path = new ArrayList<>(diff + 1);
                while (diff >= 0) {
                    path.add(new Position(x_index - diff, y_index - diff));
                    diff--;
                }
                return path;
            }
        }
    }
}
