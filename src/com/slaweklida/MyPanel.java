package com.slaweklida;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 840;
    final int PANEL_HEIGHT = 560;
    private Timer timer;
    private ArrayList<Chunk> chunks;

    public MyPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.timer = new Timer(17, this); //17
        this.chunks = new ArrayList<Chunk>();
        for(int i = 1; i <= 10; i++){
            this.chunks.add(new Chunk(i * 20, 50, 5, i * 4, Color.blue));
        }
    }

    public void paint(Graphics g) {
        //must have
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;

        for(Chunk chunk : chunks){
            g2D.drawRect(chunk.getX(), chunk.getY(), chunk.getWidth(), chunk.getHeight());
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
