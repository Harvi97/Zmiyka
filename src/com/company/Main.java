package com.company;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Dima
 */
public class Main extends JFrame {

    public Main() {
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(370, 395);
        setLocation(100, 100);
        setResizable(false);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        Main mw = new Main();
    }

}