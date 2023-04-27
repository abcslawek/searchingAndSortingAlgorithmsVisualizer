package com.slaweklida;

import javax.swing.*;

public class MyFrame extends JFrame {
    private MyPanel panel;
    public MyFrame() {
        this.panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(this.panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
