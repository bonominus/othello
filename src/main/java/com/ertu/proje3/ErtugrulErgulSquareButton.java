package com.ertu.proje3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ErtugrulErgulSquareButton extends JButton {
    private static final Color LIGHT_BROWN = new Color(190, 160, 120);
    private static final Color LIGHTER_BROWN = new Color(220, 190, 150);
    private static final int DEFAULT_SIZE = 72;
    
    private boolean pressed;
    private boolean hasCircle;
    private boolean circleIsWhite;
    
    private ErtugrulErgulPosition point;
    
    public ErtugrulErgulSquareButton() {
        this(DEFAULT_SIZE);
    }
    
    public ErtugrulErgulSquareButton(int size) {
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
                setBackground(LIGHTER_BROWN); // When the cursor is on the button, a whitening effect is
                                                // applied to the button to imply it is clickable
            }
            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(LIGHT_BROWN); // Whitening effect is reverted when the cursor leaves the button
            }
        });
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(LIGHT_BROWN);
    }

    public ErtugrulErgulPosition getPoint() {
        return point;
    }

    public void setPoint(ErtugrulErgulPosition point) {
        this.point = point;
    }
    
    public void setPoint(int x, int y) {
        this.point = new ErtugrulErgulPosition(x, y);
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
        
        // If the button is clicked, a darkening effect is applied. Otherwise default brown color is used.
        Color backgroundColor = pressed ? LIGHT_BROWN.darker() : getBackground();
        g2d.setColor(backgroundColor);
        g2d.fillRect(0, 0, getPreferredSize().width, getPreferredSize().height);
        
        // Eğer butona taş konulmuşsa...
        if (hasCircle) {
            // Circles are drawn to touch the lines of buttons
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
