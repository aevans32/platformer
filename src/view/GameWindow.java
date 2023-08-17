package view;

import javax.swing.*;

public class GameWindow extends JFrame {

    private JFrame jframe;

    public GameWindow () {
        this.jframe = new JFrame();
        jframe.setSize(400, 400);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}
