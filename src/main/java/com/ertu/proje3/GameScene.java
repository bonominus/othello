/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ertu.proje3;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;

/**
 *
 * @author ergul
 */
public class GameScene extends javax.swing.JFrame {

    /**
     * Creates new form GameScene
     */
    public GameScene(Player player1, Player player2 ) {
        initComponents();
        p1UnameLabel.setText(player1.getUsername());
        p1UnameLabel.setEnabled(true);
        p2UnameLabel.setText(player2.getUsername());
        p2UnameLabel.setEnabled(true);
        
        state = new GameState(player1, player2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        sizeSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        newGameButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        p1UnameLabel = new javax.swing.JLabel();
        p2UnameLabel = new javax.swing.JLabel();
        scoreBoardButton = new javax.swing.JButton();
        passMoveButton = new javax.swing.JButton();
        gamePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jSplitPane1.setDividerLocation(65);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        controlPanel.setBackground(new java.awt.Color(201, 199, 175));
        controlPanel.setPreferredSize(new java.awt.Dimension(400, 60));

        sizeSpinner.setModel(new javax.swing.SpinnerNumberModel(6, 6, 10, 2));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Player 1: ");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Player 2:");

        newGameButton.setText("New Game");
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Size:");

        p1UnameLabel.setForeground(new java.awt.Color(0, 0, 0));
        p1UnameLabel.setText("jLabel4");
        p1UnameLabel.setEnabled(false);

        p2UnameLabel.setForeground(new java.awt.Color(0, 0, 0));
        p2UnameLabel.setText("jLabel5");
        p2UnameLabel.setEnabled(false);

        scoreBoardButton.setText("Scoreboard");

        passMoveButton.setText("Pass");
        passMoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passMoveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scoreBoardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(passMoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p2UnameLabel))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(p1UnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(newGameButton)
                    .addComponent(p1UnameLabel))
                .addGap(5, 5, 5)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(p2UnameLabel))
                .addGap(15, 15, 15))
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scoreBoardButton)
                    .addComponent(passMoveButton))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(controlPanel);

        gamePanel.setBackground(new java.awt.Color(111, 90, 108));

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(gamePanel);

        getContentPane().add(jSplitPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        gamePanel.removeAll();
        int size = (Integer)sizeSpinner.getValue();
        buttons = new SquareButton[size][size];
        gamePanel.setLayout(new GridLayout(size, size, 0, 0));
        Insets margin = new Insets(0, 0, 0, 0);
        Dimension panel_size = gamePanel.getSize();
        int button_size = (panel_size.width * panel_size.width) / size;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                SquareButton button = new SquareButton(button_size);
                button.setMargin(margin);
                button.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        squareButtonActionPerformed(evt);
                    }
                });
                button.setSize(64, 64);
                //button.setEnabled(false);
                buttons[i][j] = button;
                gamePanel.add(button);
            }
        }
        
        int board_half = size / 2;
        buttons[board_half - 1][board_half - 1].setHasCircle(true, false);
        buttons[board_half - 1][board_half - 1].setEnabled(false);
        buttons[board_half][board_half - 1].setHasCircle(true, true);
        buttons[board_half][board_half - 1].setEnabled(false);
        buttons[board_half - 1][board_half].setHasCircle(true, true);
        buttons[board_half - 1][board_half].setEnabled(false);
        buttons[board_half][board_half].setHasCircle(true, false);
        buttons[board_half][board_half].setEnabled(false);
        
        gamePanel.revalidate();
        gamePanel.repaint();
    }//GEN-LAST:event_newGameButtonActionPerformed

    private void passMoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passMoveButtonActionPerformed
        if (state.getCurrentPlayer() == GameState.Turn.BLACK) {
            state.setCurrentPlayer(GameState.Turn.WHITE);
        } else {
            state.setCurrentPlayer(GameState.Turn.BLACK);
        }
    }//GEN-LAST:event_passMoveButtonActionPerformed

    private void squareButtonActionPerformed(java.awt.event.ActionEvent evt) {
        SquareButton button = (SquareButton)evt.getSource();
        if (state.getCurrentPlayer() == GameState.Turn.BLACK) {
            button.setHasCircle(true, false);
            state.setCurrentPlayer(GameState.Turn.WHITE);
        } else {
            button.setHasCircle(true, true);
            state.setCurrentPlayer(GameState.Turn.BLACK);
        }
    }
    
    private GameState state;
    private SquareButton[][] buttons;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton newGameButton;
    private javax.swing.JLabel p1UnameLabel;
    private javax.swing.JLabel p2UnameLabel;
    private javax.swing.JButton passMoveButton;
    private javax.swing.JButton scoreBoardButton;
    private javax.swing.JSpinner sizeSpinner;
    // End of variables declaration//GEN-END:variables
}