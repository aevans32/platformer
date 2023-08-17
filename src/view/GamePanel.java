package view;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public GamePanel() {
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g); //calling the superclass of the existing paintComponent
        // this call also cleans the surface to paint a new picture
        g.fillRect(100,100,200,50); //position and size of the rectangle
    }


}
