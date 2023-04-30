package com.ertu.proje3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SquareButton extends JButton {
    private static final Color LIGHT_BROWN = new Color(190, 160, 120);
    private static final Color LIGHTER_BROWN = new Color(220, 190, 150);
    private static final int DEFAULT_SIZE = 72;
    
    private boolean pressed;
    private boolean hasCircle;
    private boolean circleIsWhite;
    
    private Position point;
    
    public SquareButton() {
        this(DEFAULT_SIZE);
    }
    
    public SquareButton(int size) {
        hasCircle = false;
        setPreferredSize(new Dimension(size, size));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                pressed = true;
                repaint();
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                pressed = false;
                repaint();
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(LIGHTER_BROWN);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(LIGHT_BROWN);
            }
        });
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(LIGHT_BROWN);
    }

    public Position getPoint() {
        return point;
    }

    public void setPoint(Position point) {
        this.point = point;
    }
    
    public void setPoint(int x, int y) {
        this.point = new Position(x, y);
    }
    
    @Override
    public Dimension getPreferredSize() {
        return isPreferredSizeSet() ? super.getPreferredSize() : new Dimension(DEFAULT_SIZE, DEFAULT_SIZE);
    }
    
    public void setHasCircle(boolean hasCircle, boolean circleIsWhite) {
        this.hasCircle = hasCircle;
        this.circleIsWhite = circleIsWhite;
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        Color backgroundColor = pressed ? LIGHT_BROWN.darker() : getBackground();
        g2d.setColor(backgroundColor);
        g2d.fillRect(0, 0, getPreferredSize().width, getPreferredSize().height);
        
        if (hasCircle) {
            g2d.setColor(circleIsWhite ? Color.WHITE : Color.BLACK);
            g2d.fillOval(getVerticalAlignment(), getHorizontalAlignment(), getSize().width, getSize().height);
        }
    }
    
    public int isFilled() {
        if (hasCircle && !circleIsWhite) {
            return 1;
        } else if (hasCircle && circleIsWhite) {
            return 2;
        } else {
            return 0;
        }
    }
}
