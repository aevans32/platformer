package view;

import javax.swing.*;

public class GameWindow extends JFrame {

    private JFrame jframe;

    public GameWindow (GamePanel gamePanel) {
        this.jframe = new JFrame();
        jframe.setSize(400, 400);

        jframe.add(gamePanel);//this links JFrame with JPanel
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true); //this needs to be at the bottom to repaint when resizing
    }



}
